package cn.hups.dockingERP.dingding;

import cn.hups.common.utils.StringUtils;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 后端请求工具类
 */
public class ClientUtil {

    /**
     * 后端发起Get请求并返回String类型的结果
     * @param url url链接
     * @param params 参数集合
     * @return String
     */
    public static String doGetResultStr(String url, Map<String, String> params) {
        // 最终返回结果
        String resultStr = "";

        if (StringUtils.isNotEmpty(url)) {
            // 创建Httpclient对象
            CloseableHttpClient httpclient = HttpClients.createDefault();
            // 返回结果对象
            CloseableHttpResponse response = null;
            try {
                // 创建url
                URIBuilder builder = new URIBuilder(url);

                // 初始化GET请求参数
                if (params != null && params.size() > 0) {
                    for (String key : params.keySet()) {
                        builder.addParameter(key, params.get(key));
                    }
                }

                URI uri = builder.build();
                // 创建http GET请求
                HttpGet httpGet = new HttpGet(uri);
                // 执行请求
                response = httpclient.execute(httpGet);
                // 判断返回状态是否为200
                if (response.getStatusLine().getStatusCode() == 200) {
                    resultStr = EntityUtils.toString(response.getEntity(), "UTF-8");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }
                    httpclient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return resultStr;
    }

    /**
     * 后端发起POST请求并获取String类型的结果
     * @param url url链接
     * @param params 参数集合
     * @return String
     */
    public static String doPostResultStr(String url, Map<String, String> params) {
        // 最终返回结果
        String resultStr = "";

        if (StringUtils.isNotEmpty(url)) {
            // 创建Httpclient对象
            CloseableHttpClient httpclient = HttpClients.createDefault();
            // 返回结果对象
            CloseableHttpResponse response = null;

            try {
                // 创建Http Post请求
                HttpPost httpPost = new HttpPost(url);

                // 创建参数列表
                if (params != null && params.size() > 0) {
                    List<NameValuePair> paramList = new ArrayList<>();
                    for (String key : params.keySet()) {
                        paramList.add(new BasicNameValuePair(key, params.get(key)));
                    }
                    // 模拟表单
                    UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList, "UTF-8");
                    httpPost.setEntity(entity);
                }
                // 执行http请求
                response = httpclient.execute(httpPost);
                // 判断返回状态是否为200
                if (response.getStatusLine().getStatusCode() == 200) {
                    resultStr = EntityUtils.toString(response.getEntity(), "UTF-8");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (response != null) {
                        response.close();
                    }
                    httpclient.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        return resultStr;
    }
}
