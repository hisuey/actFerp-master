package cn.hups.common.utils;

import java.util.Random;
import java.util.UUID;

public class RanDomUtil {

    /**
     * @return 随机6位数字
     */
    public static String randomNum() {
        Random random = new Random();
        StringBuilder result= new StringBuilder();
        for (int i=0;i<6;i++) {
            result.append(random.nextInt(10));
        }
        return result.toString();
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
