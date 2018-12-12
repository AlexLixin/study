package interfaces.exercises;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

class charGenerator implements Readable {
    int count = 10;

    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0)
            return -1;

        char[] charArray = "fdsafdaxlingds".toCharArray();
        for (char c : charArray) {
            cb.append(c);
        }
        cb.append(" ");
        return charArray.length + 1;
    }

}

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new charGenerator());
        while (scanner.hasNext())
            System.out.println(scanner.next());
    }
}


/*// interfaces/AdaptedRandomChars16.java
// TIJ4 Chapter Interfaces, Exercise 16, page 334
/* Create a class that produces a sequence of chars. Adapt this class so
* that it can be an input to a Scanner object.
*/
/* Solution includes, in same package:
* import java.util.*;
*
* public class RandomChars {
*   private static Random rand = new Random();
*   public char next() {
*       return (char)rand.nextInt(128);
*   }
*   public static void main(String[] args) {
*       RandomChars rc = new RandomChars();
*       for(int i = 0; i < 10; i++)
*           System.out.print(rc.next() + " ");
*   }
* }
import java.nio.*;
import java.util.*;

public class AdaptedRandomChars16
        extends RandomChars
        implements Readable {
    private int count;
    public AdaptedRandomChars16(int count) {
        this.count = count;
    }
    public int read(CharBuffer cb) {
        if(count-- == 0) return -1;
        String result = Character.toString(next()) + " ";
        cb.append(result);
        return result.length();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomChars16(10));
        while(s.hasNext())
            System.out.println(s.next() + " ");
    }
}
*/