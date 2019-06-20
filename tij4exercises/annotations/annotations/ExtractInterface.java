/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 20, 2019
 *
 ************************************************************************/
package annotations;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
    public String value();
} ///:~