/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  Mar 26, 2019
 *
 ************************************************************************/
package generics;

//: generics/NonCovariantGenerics.java
//{CompileTimeError} (Won’t compile)
import java.util.*;

public class NonCovariantGenerics {
    //Compile Error: incompatible types:
    //List<Fruit> flist = new ArrayList<Apple>();
}
