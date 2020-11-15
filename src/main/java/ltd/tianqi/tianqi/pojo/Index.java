/**
  * Copyright 2020 aTool.org 
  */
package ltd.tianqi.tianqi.pojo;

/**
 * Auto-generated: 2020-01-10 20:55:11
 *
 * @author aTool.org (i@aTool.org)
 * @website http://www.atool9.com/json2javabean.php
 */
@lombok.Data
public class Index {

    private String title;
    private String level;
    private String desc;
    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setLevel(String level) {
         this.level = level;
     }
     public String getLevel() {
         return level;
     }

    public void setDesc(String desc) {
         this.desc = desc;
     }
     public String getDesc() {
         return desc;
     }

}