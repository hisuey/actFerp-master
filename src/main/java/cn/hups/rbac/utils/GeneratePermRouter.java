package cn.hups.rbac.utils;

import cn.hups.rbac.po.UserPermPo;
import cn.hups.rbac.po.VueRouterPo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 封装router的数据格式
 */
public class GeneratePermRouter {

    public List<VueRouterPo> initRouterList(List<UserPermPo> userPermPoJoList) {
        List<VueRouterPo> resultList = new ArrayList<>();

        // 获取一级菜单权限资源
        List<UserPermPo> parentMenuPermPo = getParentPermMenu(userPermPoJoList);

        if (parentMenuPermPo != null && parentMenuPermPo.size() > 0) {
            for (UserPermPo userPermPoOne : parentMenuPermPo) {
                if (userPermPoOne != null) {
                    VueRouterPo oneVueRouterVO = new VueRouterPo();
                    oneVueRouterVO.setPath(userPermPoOne.getMenuCode());
                    oneVueRouterVO.setName(userPermPoOne.getMenuCode());
                    oneVueRouterVO.setComponent(userPermPoOne.getUrl());
                    Map<String, String> metaMap = new HashMap<>();
                    metaMap.put("title", userPermPoOne.getMenuName());
                    metaMap.put("icon", userPermPoOne.getIcno());
                    oneVueRouterVO.setMeta(metaMap);
                    oneVueRouterVO.setChildren(getChild(userPermPoOne, userPermPoJoList));// 递归遍历子菜单

                    resultList.add(oneVueRouterVO);
                }
            }
        }

        return resultList;
    }

    /**
     * 递归获取菜单下的子权限集
     * @param userPermPoOne
     * @param userPermPoJoList
     * @return
     */
    private List<VueRouterPo> getChild(UserPermPo userPermPoOne, List<UserPermPo> userPermPoJoList) {
        List<VueRouterPo> childRouter = new ArrayList<>();

        if (userPermPoOne != null && userPermPoJoList != null && userPermPoJoList.size() > 0) {
            Integer pkMenu = userPermPoOne.getPkMenu();// 父级菜单主键
            if (pkMenu != null) {
                for (UserPermPo oneChildUserPerm : userPermPoJoList) {
                    if (oneChildUserPerm != null && pkMenu == oneChildUserPerm.getParentId()) {
                        VueRouterPo oneRouterChild = new VueRouterPo();
                        oneRouterChild.setPath(oneChildUserPerm.getMenuCode());
                        oneRouterChild.setComponent(oneChildUserPerm.getUrl());
                        oneRouterChild.setName(oneChildUserPerm.getMenuCode());
                        Map<String, String> metaMap = new HashMap<>();
                        metaMap.put("title", oneChildUserPerm.getMenuName());
                        metaMap.put("icon", oneChildUserPerm.getIcno());
                        oneRouterChild.setMeta(metaMap);
                        oneRouterChild.setChildren(getChild(oneChildUserPerm, userPermPoJoList));// 递归遍历子菜单

                        childRouter.add(oneRouterChild);
                    }
                }
            }
        }

        // 递归退出条件
        if (childRouter.size() == 0) {
            return childRouter;
        }

        return childRouter;
    }

    /**
     * 获取所有一起菜单权限资源
     * @param userPermPoJoList
     * @return
     */
    public List<UserPermPo> getParentPermMenu(List<UserPermPo> userPermPoJoList) {
        List<UserPermPo> parentMenuPerm = new ArrayList<>();

        if (userPermPoJoList != null && userPermPoJoList.size() > 0) {
            for (int i=0;i<userPermPoJoList.size();i++) {
                UserPermPo oneUserPermPo = userPermPoJoList.get(i);
                if (oneUserPermPo != null && oneUserPermPo.getParentId() == null) {
                    parentMenuPerm.add(oneUserPermPo);
                }
            }
        }

        return parentMenuPerm;
    }
}
