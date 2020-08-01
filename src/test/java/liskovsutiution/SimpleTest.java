package liskovsutiution;

import org.liskovsutiution.Rectangle;
import org.liskovsutiution.Square;

public class SimpleTest {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() >= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:" + rectangle.getWidth()+",height:"+ rectangle.getHeight());
        }
        System.out.println("resize end,width:" + rectangle.getWidth()+",height:"+ rectangle.getHeight());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20L);
        rectangle.setHeight(10L);
        resize(rectangle);


    }

}
