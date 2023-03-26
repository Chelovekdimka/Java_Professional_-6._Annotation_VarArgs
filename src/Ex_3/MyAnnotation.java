package Ex_3;

import java.lang.annotation.*;
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface MyAnnotation {
    String str();
    int val();
}