/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  2019Äê4ÔÂ24ÈÕ
 *
 ************************************************************************/
package containers.exercises;

import containers.AssociativeArray;
import static net.mindview.util.Print.print;
import net.mindview.util.TextFile;

public class Exercise13 {
	public static void main(String[] args) {
		String[] textFile = TextFile.read("C:\\Users\\LXI\\Desktop\\tmp\\abc.txt").replaceAll("[().,]", " ").split("\\s+");
		AssociativeArray<String, Integer> a = new AssociativeArray<String, Integer>(textFile.length);
		for (String string : textFile) {
			a.put(string, a.get(string) == null ? 1 : a.get(string) + 1);
		}
		print(a.toString());

	}
}
