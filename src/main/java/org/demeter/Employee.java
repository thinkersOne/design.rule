package org.demeter;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("目前发布的课程数量为:"+ courseList.size());
    }
}
