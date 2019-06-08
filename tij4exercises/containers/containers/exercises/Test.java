/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 1, 2019
 *
 ************************************************************************/
package containers.exercises;

import containers.TestParam;

//Framework for performing timed tests of containers.
public abstract class Test<C> {
	String name;

	public Test(String name) {
		this.name = name;
	}

//Override this method for different tests.
//Returns actual number of repetitions of test.
	abstract int test(C container, TestParam tp);
} /// :~
