/**
  * Copyright 2020 aTool.org 
  */
package ltd.tianqi.tianqi.pojo;

import lombok.Data;

/**
 * Auto-generated: 2020-01-10 20:55:11
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool9.com/json2javabean.php
 */
@Data
public class Hours {

    private String day;
    private String wea;
    private String tem;
    private String win;
   // @JsonProperty("win_speed")
    private String winSpeed;
    public void setDay(String day) {
         this.day = day;
     }
     public String getDay() {
         return day;
     }

    public void setWea(String wea) {
         this.wea = wea;
     }
     public String getWea() {
         return wea;
     }

    public void setTem(String tem) {
         this.tem = tem;
     }
     public String getTem() {
         return tem;
     }

    public void setWin(String win) {
         this.win = win;
     }
     public String getWin() {
         return win;
     }

    public void setWinSpeed(String winSpeed) {
         this.winSpeed = winSpeed;
     }
     public String getWinSpeed() {
         return winSpeed;
     }

}