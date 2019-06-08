//: typeinfo/pets/Pets.java
// Facade to produce a default PetCreator.
package typeinfo.pets;
import java.util.*;

import typeinfo.exercises.Exercise15;

public class Pets {
  public static final PetCreator creator =
    new Exercise15();
  public static Pet randomPet() {
    return Exercise15.createRandom();
  }
  public static Pet[] createArray(int size) {
    return creator.createArray(size);
  }
  public static ArrayList<Pet> arrayList(int size) {
    return creator.arrayList(size);
  }
} ///:~
