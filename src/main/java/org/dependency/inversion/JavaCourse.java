package org.dependency.inversion;

public class JavaCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Tom 正在学习java课程!");
    }
}
