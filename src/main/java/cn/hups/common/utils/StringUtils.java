package cn.hups.common.utils;

import cn.hups.common.exception.GlobalException;

import java.util.ArrayList;
import java.util.List;

/**
 * 字符串工具类集
 */
public class StringUtils {
    /**
     * 判断字符串是否为空 null || ""
     */
    public static boolean isEmpty(String str) {
        return str==null || "".equals(str);
    }

    /**
     * 判断字符串是否不为空 null || ""
     */
    public static boolean isNotEmpty(String str) {
        return !StringUtils.isEmpty(str);
    }

    /**
     * 将接收到的ids转换为List集合
     * @param ids
     * @return
     */
    public static List<String> idsParamToListStr(String ids) throws GlobalException{
        List<String> pks = new ArrayList<>();
        if (isNotEmpty(ids)) {
            ids = ids.replaceAll("\\[","").replaceAll("]","").replaceAll("\\{","").replaceAll("}","");
            String[] idsArr = ids.split(",");
            if (idsArr != null && idsArr.length > 0) {
                for (int i=0;i<idsArr.length;i++) {
                    String oneId = idsArr[i];
                    if (isNotEmpty(oneId)) {
                        try {
                            pks.add(oneId.trim());
                        } catch (NumberFormatException e) {
                            throw new GlobalException("主键格式错误!");
                        }
                    }
                }
            }
        }
        return pks;
    }

    /**
     * 将接收到的ids转换为List集合
     * @param ids
     * @return
     */
    public static List<Integer> idsParamToListInt(String ids) throws GlobalException{
        List<Integer> pks = new ArrayList<>();
        if (isNotEmpty(ids)) {
            ids = ids.replaceAll("\\[","").replaceAll("]","").replaceAll("\\{","").replaceAll("}","");
            String[] idsArr = ids.split(",");
            if (idsArr != null && idsArr.length > 0) {
                for (int i=0;i<idsArr.length;i++) {
                    String oneId = idsArr[i];
                    if (isNotEmpty(oneId)) {
                        try {
                            String strOneId = oneId.trim();
                            pks.add(Integer.parseInt(strOneId));
                        } catch (NumberFormatException e) {
                            throw new GlobalException("主键格式错误!");
                        }
                    }
                }
            }
        }
        return pks;
    }
}
