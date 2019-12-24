package cn.hups.dockingERP.dingding;

import cn.hups.common.utils.StringUtils;
import cn.hups.dockingERP.po.DingDingDeptPo;
import cn.hups.dockingERP.po.DingDingPsndocPo;
import cn.hups.dockingERP.po.SendMsgParam;
import cn.hups.orgs.po.BdDeptdocPo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 钉钉工具类
 */
public class DingDingUtils {
    // 企业ID
    private static final String CORPID = "dingf3361850ad5aa82a35c2f4657eb6378f";
    // 企业AppKey
    public static final String APPKEY = "dingeoorgl33aoopmiyu";
    // 企业应用的凭证密匙
    private static final String CORPSECRET = "3GghRh8YkxemR7NMOYTYykyTT7hROYQdRKjlTwTpAubngYQGqD3PQ4a7fi0JIiUm";
    // 自动分配微应用的ID
    private static final String AGENTID = "273381814";
    // 钉钉根部门ID
    public static final Integer ROOT_DEPTID = 1;
    // 对接钉钉ERP类型标识
    public static final String DINGDING_ERPTYPE = "dingding";

    /**
     * 链接调用钉钉结构先获取Token
     * @param appkey 企业AppKey
     * @param corpSecret 企业应用的凭证密匙
     * @return
     */
    private static String getToken(String appkey, String corpSecret) {
        String resultToken = "";

        String url = "https://oapi.dingtalk.com/gettoken";
        Map<String, String> params = new HashMap<>();
        params.put("corpid", appkey);
        params.put("corpsecret", corpSecret);

        String backResultStr = ClientUtil.doGetResultStr(url, params);
        if (StringUtils.isNotEmpty(backResultStr)) {
            JSONObject json = JSONObject.parseObject(backResultStr);
            if (json != null && "0".equals(json.get("errcode").toString())) {
                resultToken = json.get("access_token") == null ? "" : json.get("access_token").toString();
            }
        }
        return resultToken;
    }

    /**
     * 获取对接钉钉微应用中的所有部门信息
     * @return
     */
    public static List<DingDingDeptPo> getAllDeptInDingDing() {
        List<DingDingDeptPo> deptPoList = new ArrayList<>();

        String url = "https://oapi.dingtalk.com/department/list";
        Map<String, String> params = new HashMap<>();
        params.put("access_token", getToken(APPKEY, CORPSECRET));

        String backResultStr = ClientUtil.doGetResultStr(url, params);
        if (StringUtils.isNotEmpty(backResultStr)) {
            JSONObject json = JSONObject.parseObject(backResultStr);
            if (json != null && "0".equals(json.get("errcode").toString())) {
                JSONArray deptArr = json.get("department") == null ? null : (JSONArray)json.get("department");
                if (deptArr != null && deptArr.size() > 0) {
                    deptPoList = JSONObject.parseArray(deptArr.toJSONString(), DingDingDeptPo.class);
                }
            }
        }

        return deptPoList;
    }

    /**
     * 获取对接钉钉中的所有人员信息
     * @return
     */
    public static List<DingDingPsndocPo> getAllPsndocInDingDing(List<BdDeptdocPo> allDingDingDept) {
        List<DingDingPsndocPo> psndocPoList = new ArrayList<>();

        if (allDingDingDept != null && allDingDingDept.size() > 0) {
            String url = "https://oapi.dingtalk.com/user/listbypage";
            Map<String, String> params = new HashMap<>();
            params.put("access_token", getToken(APPKEY, CORPSECRET));
            params.put("offset", "0"); // 分页开始下标偏移量
            params.put("size", "100"); // 分页结束下标偏移量

            for (BdDeptdocPo bdDeptdocPo : allDingDingDept) {
                if (bdDeptdocPo != null && bdDeptdocPo.getErpid() != null) {
                    params.put("department_id", bdDeptdocPo.getErpid().toString()); // 设置钉钉部门主键
                    String backResultStr = ClientUtil.doGetResultStr(url, params);
                    if (StringUtils.isNotEmpty(backResultStr)) {
                        JSONObject json = JSONObject.parseObject(backResultStr);
                        if (json != null && "0".equals(json.get("errcode").toString())) {
                            JSONArray userListArr = json.get("userlist") == null ? null : (JSONArray)json.get("userlist");
                            if (userListArr != null && userListArr.size() > 0) {
                                List<DingDingPsndocPo> dingPsndocList = JSONObject.parseArray(userListArr.toJSONString(), DingDingPsndocPo.class);
                                psndocPoList.addAll(dingPsndocList);
                            }
                        }
                    }
                }
            }
        }

        return psndocPoList;
    }

    /**
     * 返回钉钉部门对应本系统中的部门主键
     * @param allDingDingDept 本系统中对接的钉钉部门信息
     * @param pkDeptDingArr 钉钉部门主键集合
     * @return
     */
    public static Integer getPkDeptdocByDingDingErp(List<BdDeptdocPo> allDingDingDept, List<Integer> pkDeptDingArr) {
        if (allDingDingDept != null && allDingDingDept.size() > 0 && pkDeptDingArr != null && pkDeptDingArr.size() > 0) {
            for (BdDeptdocPo bdDeptdocPo : allDingDingDept) {
                if (bdDeptdocPo != null) {
                    for (Integer pkDeptDing : pkDeptDingArr) {
                        if (bdDeptdocPo.getErpid().intValue() == pkDeptDing.intValue()) {
                            return bdDeptdocPo.getPkDeptdoc();
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * 推送消息给钉钉目标用户
     * @param sendMsgParam
     * @return
     */
    public static JSONObject sengDingDingMsg(SendMsgParam sendMsgParam) {
        JSONObject resultJson = null;

        if (sendMsgParam != null && sendMsgParam.getDingPsnArr() != null && sendMsgParam.getDingPsnArr().size() > 0) {
            String url = "https://oapi.dingtalk.com/topapi/message/corpconversation/asyncsend_v2";
            Map<String, String> params = new HashMap<>();
            params.put("access_token", getToken(APPKEY, CORPSECRET));
            params.put("agent_id", AGENTID);
            params.put("userid_list", listPsndocToString(sendMsgParam.getDingPsnArr()));
            String sendMsgInfo = sendMsgParam.initOAMsgInfo();
            params.put("msg", sendMsgInfo);

            String backResultStr = ClientUtil.doPostResultStr(url, params);
            if (StringUtils.isNotEmpty(backResultStr)) {
                resultJson = JSONObject.parseObject(backResultStr);
            }
        }

        return resultJson;
    }

    /**
     * 拼接推送用户消息列表String
     * @param psndocList
     * @return
     */
    private static String listPsndocToString(List<String> psndocList) {
        String user_list = "";

        if (psndocList != null && psndocList.size() > 0) {
            for (String str : psndocList) {
                if (StringUtils.isNotEmpty(str) && !"47".equals(str)) {
                    user_list = user_list + str + ",";
                }
            }
        }

        if (user_list.endsWith(",")) {
            user_list = user_list.substring(0, user_list.length() - 1);
        }

        return user_list;
    }
}
