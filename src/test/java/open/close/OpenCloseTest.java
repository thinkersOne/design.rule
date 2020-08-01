package open.close;

import org.open.close.ICourse;
import org.open.close.JavaCourse;
import org.open.close.JavaDiscountCourse;

public class OpenCloseTest {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1,"Java架构",11800D);
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程id:"+ iCourse.getId()+",课程名称:"+iCourse.getName()+
                ",原价:"+ iCourse.getPrice()+",折后价:"+ discountCourse.getDisCountPrice());

    }


}
