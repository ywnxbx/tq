/**
  * Copyright 2020 aTool.org 
  */
package ltd.tianqi.tianqi.pojo;
import java.util.Date;
import java.util.List;

/**
 * Auto-generated: 2020-01-10 20:55:11
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool9.com/json2javabean.php
 */
@lombok.Data
public class Data {

    private String day;
    private Date date;
    private String week;
    private String wea;
    //@JsonProperty("wea_img")
    private String weaImg;
    private int air;
    private int humidity;
   // @JsonProperty("air_level")
    private String airLevel;
  //  @JsonProperty("air_tips")
    private String airTips;
    private Alarm alarm;
    private String tem1;
    private String tem2;
    private String tem;
    private List<String> win;
   // @JsonProperty("win_speed")
    private String winSpeed;
    private List<Hours> hours;
    private List<Index> index;
    public void setDay(String day) {
         this.day = day;
     }
     public String getDay() {
         return day;
     }

    public void setDate(Date date) {
         this.date = date;
     }
     public Date getDate() {
         return date;
     }

    public void setWeek(String week) {
         this.week = week;
     }
     public String getWeek() {
         return week;
     }

    public void setWea(String wea) {
         this.wea = wea;
     }
     public String getWea() {
         return wea;
     }

    public void setWeaImg(String weaImg) {
         this.weaImg = weaImg;
     }
     public String getWeaImg() {
         return weaImg;
     }

    public void setAir(int air) {
         this.air = air;
     }
     public int getAir() {
         return air;
     }

    public void setHumidity(int humidity) {
         this.humidity = humidity;
     }
     public int getHumidity() {
         return humidity;
     }

    public void setAirLevel(String airLevel) {
         this.airLevel = airLevel;
     }
     public String getAirLevel() {
         return airLevel;
     }

    public void setAirTips(String airTips) {
         this.airTips = airTips;
     }
     public String getAirTips() {
         return airTips;
     }

    public void setAlarm(Alarm alarm) {
         this.alarm = alarm;
     }
     public Alarm getAlarm() {
         return alarm;
     }

    public void setTem1(String tem1) {
         this.tem1 = tem1;
     }
     public String getTem1() {
         return tem1;
     }

    public void setTem2(String tem2) {
         this.tem2 = tem2;
     }
     public String getTem2() {
         return tem2;
     }

    public void setTem(String tem) {
         this.tem = tem;
     }
     public String getTem() {
         return tem;
     }

    public void setWin(List<String> win) {
         this.win = win;
     }
     public List<String> getWin() {
         return win;
     }

    public void setWinSpeed(String winSpeed) {
         this.winSpeed = winSpeed;
     }
     public String getWinSpeed() {
         return winSpeed;
     }

    public void setHours(List<Hours> hours) {
         this.hours = hours;
     }
     public List<Hours> getHours() {
         return hours;
     }

    public void setIndex(List<Index> index) {
         this.index = index;
     }
     public List<Index> getIndex() {
         return index;
     }

}