/**
  * Copyright 2020 aTool.org 
  */
package ltd.tianqi.tianqi.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Auto-generated: 2020-01-10 20:55:11
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool9.com/json2javabean.php
 */
@lombok.Data
public class Alarm {

    @JsonProperty("alarm_type")
    private String alarmType;
    @JsonProperty("alarm_level")
    private String alarmLevel;
    @JsonProperty("alarm_content")
    private String alarmContent;
    public void setAlarmType(String alarmType) {
         this.alarmType = alarmType;
     }
     public String getAlarmType() {
         return alarmType;
     }

    public void setAlarmLevel(String alarmLevel) {
         this.alarmLevel = alarmLevel;
     }
     public String getAlarmLevel() {
         return alarmLevel;
     }

    public void setAlarmContent(String alarmContent) {
         this.alarmContent = alarmContent;
     }
     public String getAlarmContent() {
         return alarmContent;
     }

}