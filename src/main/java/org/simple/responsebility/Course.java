package org.simple.responsebility;

public class Course {

    public void study(String courseName){
        if("直播课".endsWith(courseName)){
            System.out.println("不能快进");
        }else{
            System.out.println("可以任意的来回播放");
        }

    }

}
