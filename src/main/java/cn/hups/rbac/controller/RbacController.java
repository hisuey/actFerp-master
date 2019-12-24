package cn.hups.rbac.controller;

import cn.hups.common.exception.GlobalException;
import cn.hups.common.utils.AjaxJson;
import cn.hups.rbac.po.*;
import cn.hups.rbac.service.IRbacService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 权限管理Controller
 */

@RestController
@RequestMapping("/rbac")
public class RbacController {

    @Resource
    private IRbacService iRbacService;

    /**
     * 分页查询所有系统菜单信息
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmMenuAsPage")
    public AjaxJson selectAllSmMenuAsPage(@RequestBody SmMenuPo smMenuPo) throws GlobalException {
        return iRbacService.selectAllSmMenuAsPage(smMenuPo);
    }

    /**
     * 查询所有系统菜单为菜单、参照结构数据
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmMenuAsMenu")
    public AjaxJson selectAllSmMenuAsMenu() throws GlobalException {
        return iRbacService.selectAllSmMenuAsMenu();
    }

    /**
     * 增加系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertSmMenu")
    public AjaxJson insertSmMenu(@RequestBody SmMenuPo smMenuPo) throws GlobalException {
        return iRbacService.insertSmMenu(smMenuPo);
    }

    /**
     * 根据主键集合删除系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteSmMenuByPks")
    public AjaxJson deleteSmMenuByPks(@RequestBody SmMenuPo smMenuPo) throws GlobalException {
        return iRbacService.deleteSmMenuByPks(smMenuPo);
    }

    /**
     * 更新系统菜单
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateSmMenu")
    public AjaxJson updateSmMenu(@RequestBody SmMenuPo smMenuPo) throws GlobalException {
        return iRbacService.updateSmMenu(smMenuPo);
    }

    /**
     * 分页查询所有系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllBtnAsPage")
    public AjaxJson selectAllBtnAsPage(@RequestBody SmBtnPo smBtnPo) throws GlobalException {
        return iRbacService.selectAllBtnAsPage(smBtnPo);
    }

    /**
     * 查询所有按钮作为参照
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmBtnAsRef")
    public AjaxJson selectAllSmBtnAsRef() throws GlobalException {
        return iRbacService.selectAllSmBtnAsRef();
    }

    /**
     * 根据菜单中绑定的按钮主键查询按钮信息
     * @param smMenuPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectSmBtnByBindBtn")
    public AjaxJson selectSmBtnByBindBtn(@RequestBody SmMenuPo smMenuPo) throws GlobalException {
        return iRbacService.selectSmBtnByBindBtn(smMenuPo);
    }

    /**
     * 添加系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertSmBtn")
    public AjaxJson insertSmBtn(@RequestBody SmBtnPo smBtnPo) throws GlobalException {
        return iRbacService.insertSmBtn(smBtnPo);
    }

    /**
     * 根据主键集合删除系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteSmBtnByPks")
    public AjaxJson deleteSmBtnByPks(@RequestBody SmBtnPo smBtnPo) throws GlobalException {
        return iRbacService.deleteSmBtnByPks(smBtnPo);
    }

    /**
     * 更新系统按钮
     * @param smBtnPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateSmBtn")
    public AjaxJson updateSmBtn(@RequestBody SmBtnPo smBtnPo) throws GlobalException {
        return iRbacService.updateSmBtn(smBtnPo);
    }

    /**
     * 分页查询系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmRoleAsPage")
    public AjaxJson selectAllSmRoleAsPage(@RequestBody SmRolePo smRolePo) throws GlobalException {
        return iRbacService.selectAllSmRoleAsPage(smRolePo);
    }

    /**
     * 查询所有角色作为穿梭框数据
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmRoleAsTransfer")
    public AjaxJson selectAllSmRoleAsTransfer() throws GlobalException {
        return iRbacService.selectAllSmRoleAsTransfer();
    }

    /**
     * 新增系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertSmRole")
    public AjaxJson insertSmRole(@RequestBody SmRolePo smRolePo) throws GlobalException {
        return iRbacService.insertSmRole(smRolePo);
    }

    /**
     * 根据主键集合删除系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteSmRoleByPks")
    public AjaxJson deleteSmRoleByPks(@RequestBody SmRolePo smRolePo) throws GlobalException {
        return iRbacService.deleteSmRoleByPks(smRolePo);
    }

    /**
     * 更新系统角色
     * @param smRolePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateSmRole")
    public AjaxJson updateSmRole(@RequestBody SmRolePo smRolePo) throws GlobalException {
        return iRbacService.updateSmRole(smRolePo);
    }

    /**
     * 分页查询所有用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmUserAsPage")
    public AjaxJson selectAllSmUserAsPage(@RequestBody SmUserPo smUserPo) throws GlobalException {
        return iRbacService.selectAllSmUserAsPage(smUserPo);
    }

    /**
     * 增加系统用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertSmUser")
    public AjaxJson insertSmUser(@RequestBody SmUserPo smUserPo) throws GlobalException {
        return iRbacService.insertSmUser(smUserPo);
    }

    /**
     * 根据主键集合删除用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/deleteSmUserByPks")
    public AjaxJson deleteSmUserByPks(@RequestBody SmUserPo smUserPo) throws GlobalException {
        return iRbacService.deleteSmUserByPks(smUserPo);
    }

    /**
     * 更新系统用户
     * @param smUserPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/updateSmUser")
    public AjaxJson updateSmUser(@RequestBody SmUserPo smUserPo) throws GlobalException {
        return iRbacService.updateSmUser(smUserPo);
    }

    /**
     * 根据角色查询权限资源
     * @param smPermissionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllSmPermissionByPkRole")
    public AjaxJson selectAllSmPermissionByPkRole(@RequestBody SmPermissionPo smPermissionPo) throws GlobalException {
        return iRbacService.selectAllSmPermissionByPkRole(smPermissionPo);
    }

    /**
     * 添加权限资源
     * @param smPermissionPo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertPermission")
    public AjaxJson insertPermission(@RequestBody SmPermissionPo smPermissionPo) throws GlobalException {
        return iRbacService.insertPermission(smPermissionPo);
    }

    /**
     * 根据用户ID查询所有用户绑定角色
     * @param smUserRolePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/selectAllUserRoleByUserid")
    public AjaxJson selectAllUserRoleByUserid(@RequestBody SmUserRolePo smUserRolePo) throws GlobalException {
        return iRbacService.selectAllUserRoleByUserid(smUserRolePo);
    }

    /**
     * 插入用户绑定角色
     * @param smUserRolePo
     * @return
     * @throws GlobalException
     */
    @RequestMapping("/insertUserRole")
    public AjaxJson insertUserRole(@RequestBody SmUserRolePo smUserRolePo) throws GlobalException {
        return iRbacService.insertUserRole(smUserRolePo);
    }
}
