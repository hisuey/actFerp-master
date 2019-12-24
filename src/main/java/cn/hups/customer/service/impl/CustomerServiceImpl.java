package cn.hups.customer.service.impl;

import cn.hups.common.exception.ExceptionMsgConstract;
import cn.hups.common.exception.GlobalException;
import cn.hups.common.po.Auth;
import cn.hups.common.po.ClientRefPo;
import cn.hups.common.utils.*;
import cn.hups.customer.constract.CustomerConstract;
import cn.hups.customer.dao.*;
import cn.hups.customer.entity.BdCustomdoc;
import cn.hups.customer.entity.BdCustomer;
import cn.hups.customer.po.*;
import cn.hups.customer.service.ICustomerService;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 客户信息服务实现类
 */
@Service("iCustomerService")
public class CustomerServiceImpl implements ICustomerService {

    @Resource
    private BdCustomerMapper bdCustomerMapper;

    @Resource
    private BdCustomerMapperExpand bdCustomerMapperExpand;

    @Resource
    private CustomInfoMapper customInfoMapper;

    @Resource
    private BdTakeoverMapper bdTakeoverMapper;

    @Resource
    private BdInvoiceMapper bdInvoiceMapper;

    @Resource
    private BdCustomdocMapper bdCustomdocMapper;

    @Resource
    private BdCustomdocMapperExpand bdCustomdocMapperExpand;

    /**
     * 分页查询所有客户数据
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllCustomerAsPage(BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdCustomerMapperExpand.countData(bdCustomerPo);
            List<BdCustomerPo> resultList = bdCustomerMapperExpand.selectAllCustomerAsPage(bdCustomerPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        }catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有客户作为参照
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllCustomerAsRef() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            List<ClientRefPo> resultRefs = bdCustomerMapperExpand.selectAllCustomerAsRef();
            ajaxJson.setObj(resultRefs);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有客户信息作为树结构数据
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllCustomerAsTreeNode() throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();
        List<Map<String, Object>> backTreeList = new ArrayList<>();

        try {
            List<ClientRefPo> resultRefs = bdCustomerMapperExpand.selectAllCustomerAsRef();
            if (resultRefs != null && resultRefs.size() > 0) {
                Map<String, Object> backTreeMap = new HashMap<>();
                backTreeMap.put(VueProccessDataUtils.VUE_MENUCOMP_ID, null);
                backTreeMap.put(VueProccessDataUtils.VUE_MENUCOMP_LABEL, "客户列表");
                List<Map<String, Object>> treeDataList = new ArrayList<>();
                for (ClientRefPo clientRefPo : resultRefs) {
                    Map<String, Object> dataOne = new HashMap<>();
                    dataOne.put(VueProccessDataUtils.VUE_MENUCOMP_ID, clientRefPo.getValue());
                    dataOne.put(VueProccessDataUtils.VUE_MENUCOMP_LABEL, clientRefPo.getCode() + "_" + clientRefPo.getLabel());
                    dataOne.put(VueProccessDataUtils.VUE_MENUCOMP_CHILDREN, new ArrayList<>());
                    treeDataList.add(dataOne);
                }
                backTreeMap.put(VueProccessDataUtils.VUE_MENUCOMP_CHILDREN, treeDataList);
                backTreeList.add(backTreeMap);
            }

            ajaxJson.setObj(backTreeList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过电话号码查询客户信息
     * @param tel
     * @return
     * @throws GlobalException
     */
    public BdCustomerPo selectCustomerByTel(String tel) throws GlobalException {
        BdCustomerPo resultCustomer = null;

        try {
            if (StringUtils.isNotEmpty(tel)) {
                resultCustomer = bdCustomerMapperExpand.selectCustomerByTel(tel);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return resultCustomer;
    }

    /**
     * 添加客户信息
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson insertCustomer(BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomerPo != null) {
                Auth auth = AuthUtil.getAuth();
                bdCustomerPo.setCreator(auth.getUserid());

                // 校验用户手机号全局唯一(注册或新增时不能重复手机号)
                if (StringUtils.isNotEmpty(bdCustomerPo.getTel())) {
                    BdCustomerPo resultCheck = bdCustomerMapperExpand.selectCustomerByTel(bdCustomerPo.getTel());
                    if (resultCheck != null && resultCheck.getPkCustomer() != null) {
                        throw new GlobalException(CustomerConstract.INSERT_CUSTOMER_TEL_REPEAT);
                    }
                }

                // 用户编码不能为空,否则无法设置用户密码
                if (StringUtils.isNotEmpty(bdCustomerPo.getCode())) {
                    // 如果密码参数为空,设置默认密码
                    if (StringUtils.isEmpty(bdCustomerPo.getPassword())) {
                        bdCustomerPo.setPassword(CustomerConstract.CUSTOMER_DEFAULT_PASSWORD);
                    }
                    Md5Hash hash = new Md5Hash(bdCustomerPo.getPassword(), bdCustomerPo.getCode(), 2);
                    bdCustomerPo.setPassword(hash.toString());
                }

                bdCustomerMapper.insertSelective(bdCustomerPo);
                ajaxJson.setPrimary(bdCustomerPo.getPkCustomer());
            }
        }catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除客户信息
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteCustomerByPks(BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomerPo != null && StringUtils.isNotEmpty(bdCustomerPo.getPkArr())) {
                List<Integer> pkArr = StringUtils.idsParamToListInt(bdCustomerPo.getPkArr());
                bdCustomerMapperExpand.deleteCustomerByPks(pkArr);
            }
        }catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 更新客户信息
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateCustomer(BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomerPo != null && bdCustomerPo.getPkCustomer() != null) {
                Auth auth = AuthUtil.getAuth();
                bdCustomerPo.setModifier(auth.getUserid());

                bdCustomerMapper.updateByPrimaryKeySelective(bdCustomerPo);
            }
        }catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询客户基本信息集合
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectCustomInfo(BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomerPo != null && bdCustomerPo.getPkCustomer() != null) {
                Integer pkCustomer = bdCustomerPo.getPkCustomer();
                CustomerInfoPo customerInfoPo = customInfoMapper.selectPkCustomer(pkCustomer);
                customerInfoPo.setBdCustomerPo(customerInfoPo.getBdCustomerPo() == null ? new BdCustomerPo() : customerInfoPo.getBdCustomerPo());
                customerInfoPo.setBdInvoicePo(customerInfoPo.getBdInvoicePo() == null ? new BdInvoicePo() : customerInfoPo.getBdInvoicePo());
                ajaxJson.setObj(customerInfoPo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 增加或修改收货信息
     * @param bdTakeoverPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson saveTakeOver(BdTakeoverPo bdTakeoverPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdTakeoverPo != null) {
                // 如果主键不为空执行更新
                if (bdTakeoverPo.getPkTakeover() != null) {
                    bdTakeoverMapper.updateByPrimaryKeySelective(bdTakeoverPo);
                } else { // 如果主键为空执行新增
                    // 创建时间
                    bdTakeoverPo.setCreationtime(DateUtils.getKnowTsStr());
                    // 删除标志
                    bdTakeoverPo.setDr(0);
                    // 时间戳
                    bdTakeoverPo.setTs(DateUtils.getKnowTsStr());
                    // 创建人
                    Auth auth = AuthUtil.getAuth();
                    if (auth != null) {
                        bdTakeoverPo.setCreator(auth.getUserid());
                    }
                    bdTakeoverMapper.insertSelective(bdTakeoverPo);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 保存或修改发票信息
     * @param bdInvoicePo
     * @return
     * @throws GlobalException
     */
    public AjaxJson saveInvoice(BdInvoicePo bdInvoicePo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdInvoicePo != null) {
                // 如果主键不为空执行更新
                if (bdInvoicePo.getPkInvoice() != null) {
                    bdInvoiceMapper.updateByPrimaryKeySelective(bdInvoicePo);
                } else {
                    // 创建时间
                    bdInvoicePo.setCreationtime(DateUtils.getKnowTsStr());
                    // 时间戳
                    bdInvoicePo.setTs(DateUtils.getKnowTsStr());
                    // 删除标志
                    bdInvoicePo.setDr(0);
                    // 创建人
                    Auth auth = AuthUtil.getAuth();
                    if (auth != null) {
                        bdInvoicePo.setCreator(auth.getUserid());
                    }
                    bdInvoiceMapper.insertSelective(bdInvoicePo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 保存或修改客户人员信息
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson saveCustomdoc(BdCustomdocPo bdCustomdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomdocPo != null) {
                if ("是".equals(bdCustomdocPo.getSetdeflag())) {
                    Integer pkCustomdoc = bdCustomdocPo.getPkCustomdoc();
                    Integer pkCustomer = bdCustomdocPo.getPkCustomer();
                    String customtype = bdCustomdocPo.getCustomtype();
                    if (pkCustomdoc != null && pkCustomer != null && StringUtils.isNotEmpty(customtype)) {
                        customInfoMapper.updateAllCustomdocDefaultNo(pkCustomer, customtype);
                        // 更新默认联系人
                        BdCustomdocPo updateDefPo = new BdCustomdocPo();
                        updateDefPo.setPkCustomdoc(pkCustomdoc);
                        updateDefPo.setDefaultis("是");
                        bdCustomdocMapper.updateByPrimaryKeySelective(updateDefPo);
                    }
                } else {
                    // 如果主键不为空执行更新
                    if (bdCustomdocPo.getPkCustomdoc() != null) {
                        bdCustomdocMapper.updateByPrimaryKeySelective(bdCustomdocPo);
                    } else {
                        // 时间戳
                        bdCustomdocPo.setTs(DateUtils.getKnowTsStr());
                        // 创建时间
                        bdCustomdocPo.setCreationtime(DateUtils.getKnowTsStr());
                        // 删除标志
                        bdCustomdocPo.setDr(0);
                        // 创建人
                        Auth auth = AuthUtil.getAuth();
                        if (auth != null) {
                            bdCustomdocPo.setCreator(auth.getUserid());
                        }
                        bdCustomdocMapper.insertSelective(bdCustomdocPo);
                        ajaxJson.setPrimary(bdCustomdocPo.getPkCustomdoc());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据主键集合删除客户人员档案
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson deleteBdCustomdocByPks(BdCustomdocPo bdCustomdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomdocPo != null && StringUtils.isNotEmpty(bdCustomdocPo.getPkArr())) {
                String pkArrStr = bdCustomdocPo.getPkArr();
                List<Integer> pkArr = StringUtils.idsParamToListInt(pkArrStr);
                bdCustomdocMapperExpand.deleteBdCustomdocByPks(pkArr);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 根据客户查询客户设置的默认联系人
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectCustomdocDefaultPsn(BdCustomdocPo bdCustomdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomdocPo != null && bdCustomdocPo.getPkCustomer() != null) {
                List<BdCustomdoc> resultList = customInfoMapper.selectCustomdocDefaultPsn(bdCustomdocPo.getPkCustomer());
                ajaxJson.setObj(resultList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询所有客户人员档案信息作为参照
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllCustomdocAsRef(BdCustomdocPo bdCustomdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomdocPo != null && bdCustomdocPo.getPkCustomer() != null) {
                List<ClientRefPo> resultRefs = customInfoMapper.selectAllCustomdocAsRef(bdCustomdocPo.getPkCustomer());
                ajaxJson.setObj(resultRefs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 查询用户的所有人员档案信息
     * @param bdCustomdocPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson selectAllBdCustomdocAsPage(BdCustomdocPo bdCustomdocPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            Long countNum = bdCustomdocMapperExpand.countData(bdCustomdocPo);
            List<BdCustomdocPo> resultList = bdCustomdocMapperExpand.selectAllBdCustomdocAsPage(bdCustomdocPo);
            ajaxJson.setTotal(countNum);
            ajaxJson.setObj(resultList);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }

    /**
     * 通过原密码修改客户用户密码
     * @param bdCustomerPo
     * @return
     * @throws GlobalException
     */
    public AjaxJson updateCustomerPassword(BdCustomerPo bdCustomerPo) throws GlobalException {
        AjaxJson ajaxJson = new AjaxJson();

        try {
            if (bdCustomerPo != null &&
                    StringUtils.isNotEmpty(bdCustomerPo.getOldPassword()) &&
                    StringUtils.isNotEmpty(bdCustomerPo.getNewPassword()) &&
                    bdCustomerPo.getPkCustomer() != null) {
                // 参数-原密码
                String oldPassword = bdCustomerPo.getOldPassword();
                // 参数-新秘密啊
                String newPassword = bdCustomerPo.getNewPassword();

                BdCustomerPo bdCustomerInfoPo = customInfoMapper.selectCustomByPkCustomer(bdCustomerPo.getPkCustomer());
                if (bdCustomerInfoPo != null &&
                        StringUtils.isNotEmpty(bdCustomerInfoPo.getCode()) &&
                        StringUtils.isNotEmpty(bdCustomerInfoPo.getPassword())) {
                    // 用户编码
                    String custonerCode = bdCustomerInfoPo.getCode();
                    // 用户密码-存储
                    String dbPassword = bdCustomerInfoPo.getPassword();

                    // 判断原密码是否一致(修改权限认证)
                    Md5Hash paramHash = new Md5Hash(oldPassword, custonerCode, 2);
                    if (dbPassword.equals(paramHash.toString())) {
                        BdCustomer updateParam = new BdCustomer();
                        updateParam.setPkCustomer(bdCustomerPo.getPkCustomer());
                        Md5Hash newPassHash = new Md5Hash(newPassword, custonerCode, 2);
                        updateParam.setPassword(newPassHash.toString());
                        bdCustomerMapper.updateByPrimaryKeySelective(updateParam);
                    } else {
                        throw new GlobalException(CustomerConstract.OLD_PASSWORD_ERROR);
                    }
                } else {
                    throw new GlobalException(CustomerConstract.CANNOT_FIND_CUSTOMER);
                }
            } else {
                throw new GlobalException(ExceptionMsgConstract.PARAM_WRONGFUL);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new GlobalException(ExceptionMsgConstract.SERVER_THROWS_EXCEPTION_MSG);
        }

        return ajaxJson;
    }
}
