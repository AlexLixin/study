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
public @interface Constraints {
    boolean primaryKey() default false;

    boolean allowNull() default false;

    boolean unique() default false;
}


