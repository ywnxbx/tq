package ltd.tianqi.tianqi.service;


import lombok.extern.slf4j.Slf4j;
import ltd.tianqi.tianqi.pojo.Data;
import ltd.tianqi.tianqi.pojo.Hours;
import ltd.tianqi.tianqi.pojo.JsonRootBean;
import ltd.tianqi.tianqi.pojo.TianqiResult;
import ltd.tianqi.tianqi.util.PureNetUtil;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Slf4j
@Component
public class TianqiServiceImpl implements TianqiService {
    //101210106
    public TianqiResult queryTianqi(String cityID) {
        String url =//此处以返回json格式数据示例,所以format=2,以根据城市名称为例,cityName传入中文
                "http://tianqiapi.com/api/?version=v1&cityid="+cityID+"&appid=94164851&appsecret=5GMz75Zv";
        String result = PureNetUtil.get(url);//通过工具类获取返回数据
        //System.out.println(result);

        JSONObject obj = JSONObject.fromObject(result);
        //System.out.println(obj);

        Map<String, Class<?>> dataMap = new HashMap<String, Class<?>>();
        dataMap.put("data", Data.class);
        JsonRootBean rootBean = (JsonRootBean)JSONObject.toBean(obj, JsonRootBean.class, dataMap);
        //System.out.println(rootBean);

        List<Data> dataList = rootBean.getData();
        Data tomorrow  = dataList.get(1);

        TianqiResult tianqiResult = null;
        if (tomorrow.getWea().contains("雨")){
            tianqiResult = new TianqiResult();
            tianqiResult.setDay(tomorrow.getDay());
            tianqiResult.setWeek(tomorrow.getWeek());
            tianqiResult.setWea(tomorrow.getWea());
            tianqiResult.setLowTem(tomorrow.getTem2());
            tianqiResult.setHighTem(tomorrow.getTem1());
            tianqiResult.setDate(tomorrow.getDate());

            //将tomorrow中 复杂类型Hours数组 转为Java类型
            JSONObject tomorrowData = JSONObject.fromObject(tomorrow);
            Map<String, Class<?>> hoursMap = new HashMap<String, Class<?>>();
            hoursMap.put("hours", Hours.class);
            Data dataBean = (Data)JSONObject.toBean(tomorrowData, Data.class, hoursMap);
            //System.out.println(dataBean);

            String firstRain = "";
            //得到起始下雨时间
            List<Hours> hoursList = dataBean.getHours();
            for (Hours h: hoursList) {
                if (h.getWea().toString().contains("雨")){
                    firstRain = h.getDay();
                    break;
                }
            }
            tianqiResult.setFirstRain(firstRain);
        }
        return tianqiResult;
    }
}
