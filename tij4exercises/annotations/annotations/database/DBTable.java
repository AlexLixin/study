/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 19, 2019
 *
 ************************************************************************/
package annotations.database;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DBTable {
    public String name() default "";
}
