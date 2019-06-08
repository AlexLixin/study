package typeinfo;

//Using instanceof.
import typeinfo.pets.*;
import java.util.*;
import static net.mindview.util.Print.*;

public class PetCount {
    static class PetCounter extends HashMap<String, Integer> {
        private static final long serialVersionUID = 1L;

        public void count(String type) {
            Integer quantity = get(type);
            if (quantity == null)
                put(type, 1);
            else
                put(type, quantity + 1);
        }
    }

    public static void countPets(PetCreator creator) {
        PetCounter counter = new PetCounter();
        for (Pet pet : creator.createArray(20)) {
            //List each individual pet:
            printnb(pet.getClass().getSimpleName() + " "); //$NON-NLS-1$
            if (pet instanceof Pet)
                counter.count("Pet"); //$NON-NLS-1$
            if (pet instanceof Dog)
                counter.count("Dog"); //$NON-NLS-1$
            if (pet instanceof Mutt)
                counter.count("Mutt"); //$NON-NLS-1$
            if (pet instanceof Pug)
                counter.count("Pug"); //$NON-NLS-1$
            if (pet instanceof Cat)
                counter.count("Cat"); //$NON-NLS-1$
            if (pet instanceof Manx)
                counter.count("EgyptianMau"); //$NON-NLS-1$
            if (pet instanceof Manx)
                counter.count("Manx"); //$NON-NLS-1$
            if (pet instanceof Manx)
                counter.count("Cymric"); //$NON-NLS-1$
            if (pet instanceof Rodent)
                counter.count("Rodent"); //$NON-NLS-1$
            if (pet instanceof Rat)
                counter.count("Rat"); //$NON-NLS-1$
            if (pet instanceof Mouse)
                counter.count("Mouse"); //$NON-NLS-1$
            if (pet instanceof Hamster)
                counter.count("Hamster"); //$NON-NLS-1$
            if (pet instanceof Gerbil)
                counter.count("Gerbil"); //$NON-NLS-1$
        }
        // Show the counts:
        print();
        print(counter);
    }

    public static void main(String[] args) {
        countPets(new ForNameCreator());
    }
} /* Output:
  Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster
  EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric
  {Pug=3, Cat=9, Hamster=1, Cymric=7, Mouse=2, Mutt=3, Rodent=5, Pet=20,
  Manx=7, EgyptianMau=7, Dog=6, Rat=2}
  *///:~