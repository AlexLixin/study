/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  2019Äê4ÔÂ25ÈÕ
 *
 ************************************************************************/
package containers.exercises;

import static net.mindview.util.Print.print;

import containers.SlowMap;
import net.mindview.util.TextFile;

public class Exercise15 {
	public static void main(String[] args) {
		String[] textFile = TextFile.read("C:\\Users\\LXI\\Desktop\\tmp\\abc.txt").replaceAll("[().,]", " ").split("\\s+");
		SlowMap<String, Integer> a = new SlowMap<String, Integer>();
		for (String string : textFile) {
			a.put(string, a.get(string) == null ? 1 : a.get(string) + 1);
		}
		print(a.toString());

	}
}
