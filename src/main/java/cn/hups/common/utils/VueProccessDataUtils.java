package cn.hups.common.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 处理数据结构返回到Vue中工具类
 */
public class VueProccessDataUtils {

    public static final String VUE_MENUCOMP_ID = "id";
    public static final String VUE_MENUCOMP_LABEL = "label";
    public static final String VUE_MENUCOMP_PARENTID = "parentid";
    public static final String VUE_MENUCOMP_CHILDREN = "children";
    public static final String VUE_COMP_CHECKED = "checked";

    /**
     * 组装查询结果数据为Vue菜单组件需要的数据格式
     * @param dataList 数据集
     * @param id    实体主键方法
     * @param label 实体名称方法
     * @param parentId  实体父级主键方法
     * @return
     */
    public List<Map<String, Object>> genterDataToMenu(List dataList, String id, String label, String parentId) {
        List<Map<String, Object>> resultData; // 最终返回结果
        List<Map<String, Object>> firstLeavel = new ArrayList<>(); // 一级所有目录
        List<Map<String, Object>> allCatalogList = new ArrayList<>(); // 转换后所有目录

        try {
            if (dataList != null && StringUtils.isNotEmpty(id) &&
                    StringUtils.isNotEmpty(label) && StringUtils.isNotEmpty(parentId)) {
                for (int i=0;i<dataList.size();i++) {
                    Object dataObjOne = dataList.get(i);
                    Method idMethod = getDeclaredMethod(dataObjOne, id);
                    Method labelMethod = getDeclaredMethod(dataObjOne, label);
                    Method parentIdMethod = getDeclaredMethod(dataObjOne, parentId);
                    if (labelMethod != null) {
                        Integer idValue = (Integer) idMethod.invoke(dataObjOne); // 主键
                        String labelValue = (String)labelMethod.invoke(dataObjOne); // 显示值
                        Integer parantIdValue = (Integer)parentIdMethod.invoke(dataObjOne);// 父级主键
                        if (idValue != null && StringUtils.isNotEmpty(labelValue)) {
                            Map<String, Object> catalogOne = new HashMap<>();
                            catalogOne.put(VUE_MENUCOMP_ID, idValue);
                            catalogOne.put(VUE_MENUCOMP_LABEL, labelValue);
                            catalogOne.put(VUE_MENUCOMP_PARENTID, parantIdValue);
                            catalogOne.put(VUE_COMP_CHECKED, false);
                            if (parantIdValue == null) {
                                firstLeavel.add(catalogOne);
                            }
                            allCatalogList.add(catalogOne);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        resultData = initVueCompMenuData(firstLeavel, allCatalogList);
        return resultData;
    }

    /**
     * 初始vue菜单主键Childrend结构数据
     * @param firstLeavel   所有一级目录
     * @param allCatalogList    所有目录
     * @return
     */
    private List<Map<String, Object>> initVueCompMenuData(List<Map<String, Object>> firstLeavel, List<Map<String, Object>> allCatalogList) {
        List<Map<String, Object>> resultData = new ArrayList<>(); // 最终返回结果

        if (firstLeavel != null && firstLeavel.size() > 0 &&
                allCatalogList != null && allCatalogList.size() > 0) {
            for (int i=0;i<firstLeavel.size();i++) {
                Map<String, Object> firstOne = firstLeavel.get(i);
                if (firstOne != null) {
                    firstOne.put(VUE_MENUCOMP_CHILDREN, getMenuChild(firstOne, allCatalogList));

                    resultData.add(firstOne);
                }
            }
        }

        return resultData;
    }

    /**
     * 递归获取子级菜单
     * @param firstOne
     * @param allCatalogList
     * @return
     */
    private List<Map<String, Object>> getMenuChild(Map<String, Object> firstOne, List<Map<String, Object>> allCatalogList) {
        List<Map<String, Object>> childList = new ArrayList<>();

        if (firstOne != null && allCatalogList != null && allCatalogList.size() > 0) {
            Integer fatherId = (Integer)firstOne.get(VUE_MENUCOMP_ID);
            if (fatherId != null) {
                for (Map<String, Object> allOne : allCatalogList) {
                    if (allOne != null && fatherId == allOne.get(VUE_MENUCOMP_PARENTID)) {
                        allOne.put(VUE_MENUCOMP_CHILDREN, getMenuChild(allOne, allCatalogList));

                        childList.add(allOne);
                    }
                }
            }
        }

        // 递归退出条件
        if (childList.size() == 0) {
            return childList;
        }

        return childList;
    }

    /**
     * 从当前类中循环向父类中寻找执行方法
     * @param object
     * @param methodName
     * @return
     */
    public Method getDeclaredMethod(Object object, String methodName) {
        Method method = null;
        for (Class<?> clazz = object.getClass(); clazz != Object.class; clazz = clazz.getSuperclass()) {
            try {
                method = clazz.getDeclaredMethod(methodName);
            }catch (NoSuchMethodException e) {
                // do nothing
            }
        }
        return method;
    }


}
