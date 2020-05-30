package annotations.example2;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // works on class level
public @interface StudentInfo {
    int studentAge();
    String studentName();
}
