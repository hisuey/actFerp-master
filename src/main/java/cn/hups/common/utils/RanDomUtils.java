package cn.hups.common.utils;

import java.util.Random;
import java.util.UUID;

public class RanDomUtils {

    /**
     * 所有数字
     */
    public static final String numberChar = "0123456789";

    /**
     * 返回一个定长的随机纯数字字符串(只包含数字)
     * @param length
     *            随机字符串长度
     * @return 随机字符串
     */
    public static String generateDigitalString(int length) {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sb.append(numberChar.charAt(random.nextInt(numberChar.length())));
        }
        return sb.toString();
    }

    /**
     * 生成id，主键值，32位长度
     */
    public static synchronized String getUUId(){
        return UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
    }

    /**
     * 获取取值范围中的一个随机证书 <注:生成的随机数不包含end本身>
     * @author wxc
     */
    public static int getRandomFromRange(int start,int end){
        Random random = new Random();
        return random.nextInt(end - start);
    }
}
