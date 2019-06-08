/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 5, 2019
 *
 ************************************************************************/
package containers.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import containers.TestParam;
import net.mindview.util.RandomGenerator;

public class Exercise30 {
	private static List<Test<List<Integer>>> tests = new ArrayList<>();
	static {
		tests.add(new Test<List<Integer>>("add") {
			int test(List<Integer> list, TestParam tp) {
				final int LOOPS = 1000000;
				RandomGenerator.Integer integer = new RandomGenerator.Integer();
				
				for (int i = 0; i < LOOPS; i++) {
					for (int j = 0; j < list.size(); j++) {
						list.set(j, null);
					}
					for (int j = 0; j < list.size(); j++) {
						list.add(integer.next());
					}
				}
				return LOOPS;
			}
		});
		tests.add(new Test<List<Integer>>(" add&sort") {
			int test(List<Integer> list, TestParam tp) {
				final int LOOPS = 1000000;
				RandomGenerator.Integer integer = new RandomGenerator.Integer();
				
				for (int i = 0; i < LOOPS; i++) {
					for (int j = 0; j < list.size(); j++) {
						list.add(integer.next());
					}
					Collections.sort(list);
				}
				return LOOPS;
			}
		});

	}
	
	static class SortTester extends Tester<List<Integer>>{


		public SortTester(List<Integer> container, List<Test<List<Integer>>> tests) {
			super(container, tests);
		}

		@Override
		protected List<Integer> initialize(int size) {
			RandomGenerator.Integer integer = new RandomGenerator.Integer();
			container.clear();
			for (int i = 0; i < size; i++) {
				container.add(integer.next());
			}
			return container;
		}
		
		
		
		
	}

	public static void main(String[] args) {
		SortTester.run(new ArrayList<>(), tests);
		SortTester.run(new LinkedList<>(), tests);

	}
}
