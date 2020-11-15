package ltd.tianqi.tianqi.txysender;

import com.github.qcloudsms.SmsSingleSender;
import com.github.qcloudsms.SmsSingleSenderResult;

import org.json.JSONException;

import javax.xml.ws.http.HTTPException;
import java.io.IOException;


public class SendSMSUtils {
    public void sender(String msgDate,String msgWea,String msgRem) {
        //腾讯短信应用的 SDK AppID
        int appid = 1400305837;
        String appkey = "4405a779c94f59099ce0c1f01b0ff82d";//腾讯云短信中的 App Key
        int templateId = 520008;// NOTE: 这里是短信模板ID需要在短信控制台中申请
        String smsSign = "一万年行不行";//设置信息标头，如【腾讯云】
        //验证码
        try {
            String[] params = {msgDate,msgWea,msgRem};
            SmsSingleSender ssender = new SmsSingleSender(appid, appkey);
            // 签名参数未提供或者为空时，会使用默认签名发送短信，这里的13800138000是为用户输入的手机号码
            SmsSingleSenderResult result = ssender.sendWithParam("86", "18309272192",
                    templateId, params, smsSign, "", "");
            System.out.println(result);
        } catch (HTTPException e) {
            // HTTP响应码错误
            e.printStackTrace();
        } catch (JSONException e) {
            // json解析错误
            e.printStackTrace();
        } catch (IOException e) {
            // 网络IO错误
            e.printStackTrace();
        } catch (com.github.qcloudsms.httpclient.HTTPException e) {
            e.printStackTrace();
        }
    }
}