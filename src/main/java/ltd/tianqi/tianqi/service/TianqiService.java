package ltd.tianqi.tianqi.service;

import ltd.tianqi.tianqi.pojo.TianqiResult;
import org.springframework.stereotype.Service;


@Service
public interface TianqiService {

    /**
     * 输入cityID 查询天气
     */
    TianqiResult queryTianqi(String cityID);
}
