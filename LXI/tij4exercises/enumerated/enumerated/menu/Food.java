/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 4, 2019
 *
 ************************************************************************/
package enumerated.menu;

//: enumerated/menu/Food.java
//Subcategorization of enums within interfaces.
public interface Food {
    enum Appetizer implements Food {
        SALAD, SOUP, SPRING_ROLLS;
    }

    enum MainCourse implements Food {
        LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
    }

    enum Dessert implements Food {
        TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
    }

    enum Coffee implements Food {
        BLACK_COFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
    }

    enum Curry implements Food {
        CURRY_CHICKEN, CURRY_BEEF;
    }
} ///:~