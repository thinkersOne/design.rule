package org.dependency.inversion;

public class AICourse implements ICourse{
    @Override
    public void study() {
        System.out.println("Tom 正在学习AI课程!");
    }
}
