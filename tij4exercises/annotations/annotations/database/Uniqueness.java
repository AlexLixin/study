/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 19, 2019
 *
 ************************************************************************/
package annotations.database;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
