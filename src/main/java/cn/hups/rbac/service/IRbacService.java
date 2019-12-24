package cn.hups.rbac.service;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.rbac.po.*;

import java.util.Map;

/**
 * 权限管理Service
 */
public interface IRbacService {

    /**
     * 分页查询所有系统菜单
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmMenuAsPage(SmMenuPo smMenuPo) throws GlobalException;

    /**
     * 查询所有系统菜单为菜单、参照结构数据
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmMenuAsMenu() throws GlobalException;

    /**
     * 根据用户主键查询该用户人员类别
     * @return
     * @throws GlobalException
     */
    String selectPsnTypeByUserId(Integer userid) throws GlobalException;

    /**
     * 增加系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertSmMenu(SmMenuPo smMenuPo) throws GlobalException;

    /**
     * 根据主键集合删除系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteSmMenuByPks(SmMenuPo smMenuPo) throws GlobalException;

    /**
     * 更新系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateSmMenu(SmMenuPo smMenuPo) throws GlobalException;

    /**
     * 分页查询所有系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllBtnAsPage(SmBtnPo smBtnPo) throws GlobalException;

    /**
     * 查询所有按钮作为参照
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmBtnAsRef() throws GlobalException;

    /**
     * 根据菜单中绑定的按钮主键查询按钮信息
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectSmBtnByBindBtn(SmMenuPo smMenuPo) throws GlobalException;

    /**
     * 添加系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertSmBtn(SmBtnPo smBtnPo) throws GlobalException;

    /**
     * 根据主键集合删除系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteSmBtnByPks(SmBtnPo smBtnPo) throws GlobalException;

    /**
     * 更新系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateSmBtn(SmBtnPo smBtnPo) throws GlobalException;

    /**
     * 分页查询系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmRoleAsPage(SmRolePo smRolePo) throws GlobalException;

    /**
     * 查询所有角色作为穿梭框数据
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmRoleAsTransfer() throws GlobalException;

    /**
     * 新增系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertSmRole(SmRolePo smRolePo) throws GlobalException;

    /**
     * 根据主键集合删除系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteSmRoleByPks(SmRolePo smRolePo) throws GlobalException;

    /**
     * 更新系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateSmRole(SmRolePo smRolePo) throws GlobalException;

    /**
     * 分页查询所有用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmUserAsPage(SmUserPo smUserPo) throws GlobalException;

    /**
     * 通过用户名称查询用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    SmUserPo selectSmUserByUserName(SmUserPo smUserPo) throws GlobalException;

    /**
     * 增加系统用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertSmUser(SmUserPo smUserPo) throws GlobalException;

    /**
     * 根据主键集合删除用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    AjaxJson deleteSmUserByPks(SmUserPo smUserPo) throws GlobalException;

    /**
     * 更新系统用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    AjaxJson updateSmUser(SmUserPo smUserPo) throws GlobalException;

    /**
     * 根据角色查询权限资源
     * @param smPermissionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllSmPermissionByPkRole(SmPermissionPo smPermissionPo) throws GlobalException;

    /**
     * 通过用户查询权限
     * @param userid
     * @return
     * @throws GlobalException
     */
    Map<String, Object> selectPermByUserid(Integer userid) throws GlobalException;

    /**
     * 添加权限资源
     * @param smPermissionPo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertPermission(SmPermissionPo smPermissionPo) throws GlobalException;

    /**
     * 根据用户ID查询所有用户绑定角色
     * @param smUserRolePo
     * @return
     * @throws GlobalException
     */
    AjaxJson selectAllUserRoleByUserid(SmUserRolePo smUserRolePo) throws GlobalException;

    /**
     * 插入用户绑定角色
     * @param smUserRolePo
     * @return
     * @throws GlobalException
     */
    AjaxJson insertUserRole(SmUserRolePo smUserRolePo) throws GlobalException;
}
