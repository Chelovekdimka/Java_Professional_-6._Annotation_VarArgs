package Ex_4;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@ interface Math {
    int num1() default 10;
    int num2() default 20;
}
