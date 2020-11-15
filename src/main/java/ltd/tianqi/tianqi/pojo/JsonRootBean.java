/**
  * Copyright 2020 aTool.org 
  */
package ltd.tianqi.tianqi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Auto-generated: 2020-01-10 20:55:11
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool9.com/json2javabean.php
 */

@lombok.Data
public class JsonRootBean {

    private String cityid;
    @JsonProperty("update_time")
    private String updateTime;
    private String city;
    @JsonProperty("cityEn")
    private String cityen;
    private String country;
    @JsonProperty("countryEn")
    private String countryen;
    private List<Data> data;

}