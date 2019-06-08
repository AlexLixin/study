/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 4, 2019
 *
 ************************************************************************/
package enumerated.menu;

//: enumerated/menu/Course.java
import net.mindview.util.*;

public enum Course {
    APPETIZER(Food.Appetizer.class), MAINCOURSE(Food.MainCourse.class), DESSERT(Food.Dessert.class), COFFEE(Food.Coffee.class),CURRY(Food.Curry.class);
    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
} ///:~