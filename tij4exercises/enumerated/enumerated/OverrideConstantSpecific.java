/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Jun 12, 2019
 *
 ************************************************************************/
package enumerated;

//: enumerated/OverrideConstantSpecific.java
import static net.mindview.util.Print.*;

public enum OverrideConstantSpecific {
    NUT, BOLT, WASHER {
        void f() {
            print("Overridden method");
        }
    };
    void f() {
        print("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific ocs : values()) {
            printnb(ocs + ": ");
            ocs.f();
        }
    }
} /* Output:
  NUT: default behavior
  BOLT: default behavior
  WASHER: Overridden method
  *///:~