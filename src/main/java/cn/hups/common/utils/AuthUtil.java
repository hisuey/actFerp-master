package cn.hups.common.utils;

import cn.hups.common.po.Auth;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * 一些思路:
 * 权限不直接通过shiro获取,这样以后可以直接通过修改authUtil就可以更换权限控制插件,实现可拔插式
 */
public class AuthUtil {

	/**
	 * 获取shiro中的身份信息
	 * @return 权限
	 */
	public static Auth getAuth() {
        Subject subject = SecurityUtils.getSubject();
        return (Auth) subject.getPrincipal();
	}
}
