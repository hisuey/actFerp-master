package cn.hups.rbac.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.utils.*;
import cn.hups.rbac.constract.RbacConstract;
import cn.hups.rbac.dao.*;
import cn.hups.rbac.po.*;
import cn.hups.rbac.service.IRbacService;
import cn.hups.rbac.utils.GeneratePermRouter;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 权限管理Service实现类
 */
@Service("iRbacService")
public class RbacServiceImpl implements IRbacService {

    @Resource
    private SmMenuMapper smMenuMapper;

    @Resource
    private SmMenuMapperExpand smMenuMapperExpand;

    @Resource
    private SmBtnMapper smBtnMapper;

    @Resource
    private SmBtnMapperExpand smBtnMapperExpand;

    @Resource
    private SmRoleMapper smRoleMapper;

    @Resource
    private SmRoleMapperExpand smRoleMapperExpand;

    @Resource
    private SmUserMapper smUserMapper;

    @Resource
    private SmUserMapperExpand smUserMapperExpand;

    @Resource
    private SmPermissionMapper smPermissionMapper;

    @Resource
    private SmPermissionMapperExpand smPermissionMapperExpand;

    @Resource
    private SmUserRoleMapper smUserRoleMapper;

    @Resource
    private SmUserRoleMapperExpand smUserRoleMapperExpand;

    /**
     * 分页查询所有系统菜单
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmMenuAsPage(SmMenuPo smMenuPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = smMenuMapperExpand.countData(smMenuPo);
            List<SmMenuPo> resultList = smMenuMapperExpand.selectAllSmMenuAsPage(smMenuPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);

        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有系统菜单为菜单、参照结构数据
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmMenuAsMenu() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Map<String, Object> resultMap = new HashMap<>();
            List<SmMenuPo> resultData = smMenuMapperExpand.selectAllSmMenuAsMenu();
            VueProccessDataUtils vueProccessDataUtils = new VueProccessDataUtils();
            List<Map<String, Object>> vueMenuData = vueProccessDataUtils.genterDataToMenu(resultData, "getPkMenu", "getMenuName", "getParentId");

            resultMap.put("treeData", vueMenuData); // 菜单树数据
            resultMap.put("refData", resultData); // 参照数据
            ajaxJson.setObj(resultMap);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据用户主键查询该用户人员类别
     * @return
     * @throws GlobalException
     */
    public String selectPsnTypeByUserId(Integer userid) throws GlobalException {
        String psnTypeName = "";

        try {
            if (userid != null) {
                psnTypeName = smUserMapperExpand.selectPsnTypeByUserId(userid);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return psnTypeName;
    }

    /**
     * 增加系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertSmMenu(SmMenuPo smMenuPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smMenuPo != null) {
                Auth auth = AuthUtil.getAuth();
                smMenuPo.setCreator(auth.getUserid());

                smMenuMapper.insertSelective(smMenuPo);
                ajaxJson.setPrimary(smMenuPo.getPkMenu());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteSmMenuByPks(SmMenuPo smMenuPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smMenuPo != null && StringUtils.isNotEmpty(smMenuPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(smMenuPo.getPkArr());
                smMenuMapperExpand.deleteSmMenuByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateSmMenu(SmMenuPo smMenuPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smMenuPo != null && smMenuPo.getPkMenu() != null) {
                smMenuMapper.updateByPrimaryKeySelective(smMenuPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 分页查询所有系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBtnAsPage(SmBtnPo smBtnPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = smBtnMapperExpand.countData(smBtnPo);
            List<SmBtnPo> resultList = smBtnMapperExpand.selectAllBtnAsPage(smBtnPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有按钮作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmBtnAsRef() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<SmBtnPo> resultRefs = smBtnMapperExpand.selectAllSmBtnAsRef();
            ajaxJson.setObj(resultRefs);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据菜单中绑定的按钮主键查询按钮信息
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectSmBtnByBindBtn(SmMenuPo smMenuPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smMenuPo != null && StringUtils.isNotEmpty(smMenuPo.getBindBtn())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(smMenuPo.getBindBtn());
                List<SmBtnPo> resultList = smBtnMapperExpand.selectSmBtnByBindBtn(pkArr);
                ajaxJson.setObj(resultList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 添加系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertSmBtn(SmBtnPo smBtnPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smBtnPo != null) {
                Auth auth = AuthUtil.getAuth();
                smBtnPo.setCreator(auth.getUserid());

                smBtnMapper.insertSelective(smBtnPo);
                ajaxJson.setPrimary(smBtnPo.getPkBtn());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteSmBtnByPks(SmBtnPo smBtnPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smBtnPo != null && StringUtils.isNotEmpty(smBtnPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(smBtnPo.getPkArr());
                smBtnMapperExpand.deleteSmBtnByPks(pkArr);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateSmBtn(SmBtnPo smBtnPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smBtnPo != null && smBtnPo.getPkBtn() != null) {
                smBtnMapper.updateByPrimaryKeySelective(smBtnPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 分页查询系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmRoleAsPage(SmRolePo smRolePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = smRoleMapperExpand.countData(smRolePo);
            List<SmRolePo> resultList = smRoleMapperExpand.selectAllSmRoleAsPage(smRolePo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有角色作为穿梭框数据
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmRoleAsTransfer() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<SmRolePo> resultList = smRoleMapperExpand.selectAllSmRoleAsTransfer();

            List<Object> backData = new ArrayList<>();
            if (resultList != null && resultList.size() > 0) {
                for (SmRolePo smRolePoOne : resultList) {
                    if (smRolePoOne != null) {
                        Map<String, Object> mapOne = new HashMap<>();
                        mapOne.put(RbacConstract.TRANSFER_KEY, smRolePoOne.getPkRole());
                        mapOne.put(RbacConstract.TRANSFER_LABEL, smRolePoOne.getRoleName());
                        backData.add(mapOne);
                    }
                }
            }
            ajaxJson.setObj(backData);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 新增系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertSmRole(SmRolePo smRolePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Auth auth = AuthUtil.getAuth();
            smRolePo.setCreator(auth.getUserid());

            smRoleMapper.insertSelective(smRolePo);
            ajaxJson.setPrimary(smRolePo.getPkRole());
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteSmRoleByPks(SmRolePo smRolePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smRolePo != null && StringUtils.isNotEmpty(smRolePo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(smRolePo.getPkArr());
                smRoleMapperExpand.deleteSmRoleByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateSmRole(SmRolePo smRolePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smRolePo != null && smRolePo.getPkRole() != null) {
                Auth auth = AuthUtil.getAuth();
                smRolePo.setModifier(auth.getUserid());

                smRoleMapper.updateByPrimaryKeySelective(smRolePo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 分页查询所有用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmUserAsPage(SmUserPo smUserPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = smUserMapperExpand.countData(smUserPo);
            List<SmUserPo> resultList = smUserMapperExpand.selectAllSmuserAsPage(smUserPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过用户名称查询用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    public SmUserPo selectSmUserByUserName(SmUserPo smUserPo) throws GlobalException {
        SmUserPo resultUser = null;

        try {
            if (smUserPo != null && StringUtils.isNotEmpty(smUserPo.getUserName())) {
                resultUser = smUserMapperExpand.selectSmUserByUserName(smUserPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultUser;

    }

    /**
     * 增加系统用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertSmUser(SmUserPo smUserPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smUserPo != null) {
                Auth auth = AuthUtil.getAuth();
                smUserPo.setCreator(auth.getUserid());

                smUserPo.setRandomNum(RanDomUtils.generateDigitalString(6));
                Md5Hash hash = new Md5Hash(smUserPo.getUserPassword(), smUserPo.getRandomNum(), 2);
                smUserPo.setUserPassword(hash.toString());
                smUserMapper.insertSelective(smUserPo);
                ajaxJson.setPrimary(smUserPo.getUserid());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteSmUserByPks(SmUserPo smUserPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smUserPo != null && StringUtils.isNotEmpty(smUserPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(smUserPo.getPkArr());
                smUserMapperExpand.deleteSmuserByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新系统用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateSmUser(SmUserPo smUserPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smUserPo != null && smUserPo.getUserid() != null) {
                Auth auth = AuthUtil.getAuth();
                smUserPo.setModifier(auth.getUserid());
                smUserPo.setModifiedtime(DateUtils.getKnowTsStr());

                // 更新用户时对密码处理
                if (RbacConstract.BACK_CLIENT_USERPASSWORD.equals(smUserPo.getUserPassword())) {
                    smUserPo.setUserPassword(null);
                } else {
                    Md5Hash hash = new Md5Hash(smUserPo.getUserPassword(), smUserPo.getRandomNum(), 2);
                    smUserPo.setUserPassword(hash.toString());
                }
                smUserMapper.updateByPrimaryKeySelective(smUserPo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据角色查询权限资源
     * @param smPermissionPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllSmPermissionByPkRole(SmPermissionPo smPermissionPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smPermissionPo != null && smPermissionPo.getPkRole() != null) {
                List<SmPermissionPo> resultList = smPermissionMapperExpand.selectAllSmPermissionByPkRole(smPermissionPo.getPkRole());

                // 最终返回结果集
                Map<String, Object> resultMap = new HashMap<>();

                List<Integer> menuAllList = new ArrayList<>();
                List<Integer> menuHalfList = new ArrayList<>();
                List<Integer> btnList = new ArrayList<>();
                if (resultList != null && resultList.size() > 0) {
                    for (SmPermissionPo permOne : resultList) {
                        if (permOne != null) {
                            if (RbacConstract.MENU_PERM_ALL.equals(permOne.getPermType())) {
                                menuAllList.add(permOne.getResourceid());
                            }
                            if (RbacConstract.MENU_PERM_HALF.equals(permOne.getPermType())) {
                                menuHalfList.add(permOne.getResourceid());
                            }
                            if (RbacConstract.BTN_PERM.equals(permOne.getPermType())) {
                                btnList.add(permOne.getResourceid());
                            }
                        }
                    }
                }

                resultMap.put(RbacConstract.MENU_PERM_ALL, menuAllList);
                resultMap.put(RbacConstract.MENU_PERM_HALF, menuHalfList);
                resultMap.put(RbacConstract.BTN_PERM, btnList);
                ajaxJson.setObj(resultMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过用户查询权限
     * @param userid
     * @return
     * @throws GlobalException
     */
    public Map<String, Object> selectPermByUserid(Integer userid) throws GlobalException {
        Map<String, Object> resultMap = new HashMap<>();

        try {
            if (userid != null) {
                List<UserPermPo> userPermPoList = smPermissionMapperExpand.selectPermByUserid(userid);

                if (userPermPoList != null && userPermPoList.size() > 0) {
                    Map<Integer, UserPermPo> permMap = new HashMap<>(); // 菜单、按钮资源Map
                    List<UserPermPo> permPoList = new ArrayList<>(); // 菜单、按钮资源List
                    Map<Integer, UserPermPo> roleMap = new HashMap<>(); // 角色Map
                    List<SmRolePo> smRolePoList = new ArrayList<>(); // 角色List

                    for (UserPermPo userPermPo : userPermPoList) {
                        if (userPermPo != null) {
                            Integer pkRole = userPermPo.getPkRole();
                            Integer resourceId = userPermPo.getResourceid();
                            if (resourceId != null && !permMap.containsKey(resourceId)) {
                                permMap.put(resourceId, userPermPo);
                                permPoList.add(userPermPo);
                            }
                            if (pkRole != null && !roleMap.containsKey(pkRole)) {
                                roleMap.put(pkRole, userPermPo);
                                SmRolePo roleOne = new SmRolePo();
                                roleOne.setPkRole(userPermPo.getPkRole());
                                roleOne.setRoleName(userPermPo.getRoleName());
                                smRolePoList.add(roleOne);
                            }
                        }
                    }
                    // 将查询到的用户权限封装为一个router集合
                    GeneratePermRouter generatePermRouter = new GeneratePermRouter();
                    List<VueRouterPo> vueRouterPoJoList = generatePermRouter.initRouterList(permPoList);


                    resultMap.put(RbacConstract.USER_PERM_KEY, vueRouterPoJoList);
                    resultMap.put(RbacConstract.USER_ROLE_KEY, smRolePoList);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultMap;
    }

    /**
     * 添加权限资源
     * @param smPermissionPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertPermission(SmPermissionPo smPermissionPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smPermissionPo != null && smPermissionPo.getPkRole() != null) {
                String pkMenusAll = smPermissionPo.getPkMenuArrAll(); // 菜单资源主键集_全选
                String pkMenusHalf = smPermissionPo.getPkMenuArrHalf(); // 菜单资源主键集_半选
                String pkBtns = smPermissionPo.getPkBtnArr(); // 按钮资源主键集

                // 根据角色主键统一删除旧的权限资源
                smPermissionMapperExpand.deletePermissionByPkRole(smPermissionPo.getPkRole());
                List<SmPermissionPo> newPermList = new ArrayList<>();

                // 初始菜单权限资源集合
                initSmPermPoList(newPermList, pkMenusAll, smPermissionPo.getPkRole(), RbacConstract.MENU_PERM_ALL);
                initSmPermPoList(newPermList, pkMenusHalf, smPermissionPo.getPkRole(), RbacConstract.MENU_PERM_HALF);

                // 初始按钮权限资源集合
                if (StringUtils.isNotEmpty(pkBtns)) {
                    List<Integer> pkBtnArr = StringUtils.idsParamToListInt(pkBtns);
                }

                // 批量插入新的权限资源
                if (newPermList != null && newPermList.size() > 0) {
                    smPermissionMapperExpand.insertByBatch(newPermList);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 初始权限资源VO
     * @param newPermList
     * @param pkMenus
     * @param type
     * @return
     */
    private void initSmPermPoList(List<SmPermissionPo> newPermList, String pkMenus, Integer pkRole, String type) {
        if (StringUtils.isNotEmpty(pkMenus) && StringUtils.isNotEmpty(type)) {
            List<Integer> pkMenuArr = StringUtils.idsParamToListInt(pkMenus);
            if (pkMenuArr != null && pkMenuArr.size() > 0) {
                for (Integer pkMenuOne : pkMenuArr) {
                    if (pkMenuOne != null) {
                        SmPermissionPo menuPerm = new SmPermissionPo();
                        menuPerm.setPkRole(pkRole);
                        menuPerm.setPermType(type);
                        menuPerm.setResourceid(pkMenuOne);
                        menuPerm.setCreator(null);
                        menuPerm.setCreationtime(DateUtils.getKnowTsStr());
                        menuPerm.setDr(0);
                        menuPerm.setTs(DateUtils.getKnowTsStr());
                        newPermList.add(menuPerm);
                    }
                }
            }
        }
    }

    /**
     * 根据用户ID查询所有用户绑定角色
     * @param smUserRolePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllUserRoleByUserid(SmUserRolePo smUserRolePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smUserRolePo != null && smUserRolePo.getUserid() != null) {
                Integer userid = smUserRolePo.getUserid();
                List<SmUserRolePo> resultData = smUserRoleMapperExpand.selectAllUserRoleByUserid(userid);

                List<Integer> roleIdArr = new ArrayList<>();
                if (resultData != null && resultData.size() > 0) {
                    for (SmUserRolePo smUserRolePo1One : resultData) {
                        if (smUserRolePo1One != null && smUserRolePo1One.getPkRole() != null) {
                            roleIdArr.add(smUserRolePo1One.getPkRole());
                        }
                    }
                }

                Map<String, Object> resultMap = new HashMap<>();
                resultMap.put("refData", resultData);
                resultMap.put("idArr", roleIdArr);
                ajaxJson.setObj(resultMap);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 插入用户绑定角色
     * @param smUserRolePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertUserRole(SmUserRolePo smUserRolePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (smUserRolePo != null && smUserRolePo.getUserid() != null && StringUtils.isNotEmpty(smUserRolePo.getUserRoleArr())) {
                Integer userid = smUserRolePo.getUserid();
                List<Integer> userRoleArr = StringUtils.idsParamToListInt(smUserRolePo.getUserRoleArr());

                // 根据用户主键删除用户绑定角色
                smUserRoleMapperExpand.deleteUserRoleByPkUserid(userid);

                List<SmUserRolePo> addUserRoleList = new ArrayList<>();
                if (userRoleArr != null && userRoleArr.size() > 0) {
                    for (Integer userRoleOne : userRoleArr) {
                        if (userRoleOne != null) {
                            initSmUserRole(addUserRoleList, userid, userRoleOne);
                        }
                    }
                }

                if (addUserRoleList.size() > 0) {
                    smUserRoleMapperExpand.insertByBatch(addUserRoleList);
                }
            } else if (smUserRolePo != null && smUserRolePo.getUserid() != null && StringUtils.isEmpty(smUserRolePo.getUserRoleArr())) {
                // 根据用户主键删除用户绑定角色
                smUserRoleMapperExpand.deleteUserRoleByPkUserid(smUserRolePo.getUserid());
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 初始用户绑定角色
     * @param addUserRoleList
     * @param userid
     * @param pkrole
     * @return
     */
    public void initSmUserRole(List<SmUserRolePo> addUserRoleList, Integer userid, Integer pkrole) {
        SmUserRolePo smUserRolePo = new SmUserRolePo();
        smUserRolePo.setUserid(userid);
        smUserRolePo.setPkRole(pkrole);
        smUserRolePo.setCreator(null);
        smUserRolePo.setCreationtime(DateUtils.getKnowTsStr());
        smUserRolePo.setDr(0);
        smUserRolePo.setTs(DateUtils.getKnowTsStr());
        addUserRoleList.add(smUserRolePo);
    }
}
