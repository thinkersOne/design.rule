package org.dependency.inversion;

public class PythCourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Tom 正在学习Python课程!");
    }
}
