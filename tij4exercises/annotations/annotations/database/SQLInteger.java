/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 19, 2019
 *
 ************************************************************************/
package annotations.database;

import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SQLInteger {

    String name() default "";

    Constraints constraints() default @Constraints;
}
