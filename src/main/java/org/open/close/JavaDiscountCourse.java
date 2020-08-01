package org.open.close;

public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDisCountPrice(){
        return super.getPrice() * 0.6;
    }

}
