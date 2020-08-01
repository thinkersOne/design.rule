package dependency.inversion;

import org.dependency.inversion.AICourse;
import org.dependency.inversion.JavaCourse;
import org.dependency.inversion.PythCourse;
import org.dependency.inversion.Tom;

public class DipTest {

    public static void main(String[] args) {
//        V1版本
//        Tom tom = new Tom();
//        tom.studyJavaSource();
//        tom.studyPythCourse();
//        tom.studyAICourse();

//        V2版本
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythCourse());
//        tom.study(new AICourse());

//        V3版本
//        Tom tom = new Tom(new JavaCourse());
//        tom.study();
//        Tom tom1 = new Tom(new PythCourse());
//        tom1.study();
//        Tom tom2 = new Tom(new AICourse());
//        tom2.study();

//        V4版本
        Tom tom = new Tom();
        tom.setiCourse(new JavaCourse());
        tom.study();
        tom.setiCourse(new PythCourse());
        tom.study();
        tom.setiCourse(new AICourse());
        tom.study();

    }

}
