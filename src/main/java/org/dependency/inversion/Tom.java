package org.dependency.inversion;

public class Tom {
//      V1版本
//    public void studyJavaSource(){
//        System.out.println("Tom 正在学习java课程!");
//    }
//
//    public void studyPythCourse(){
//        System.out.println("Tom 正在学习Python课程!");
//    }
//
//    public void studyAICourse(){
//        System.out.println("Tom 正在学习AI课程!");
//    }

//    V2版本
//    public void study(ICourse iCourse){
//        iCourse.study();
//    }

//    V3版本
//    private ICourse iCourse;
//
//    public Tom(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//
//    public void study(){
//        iCourse.study();
//    }

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
    public void study(){
        iCourse.study();
    }

}
