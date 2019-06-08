/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 23, 2019
 *
 ************************************************************************/
package io;

//: io/FreezeAlien.java
//Create a serialized output file.
import java.io.*;

public class FreezeAlien {
	public static void main(String[] args) throws Exception {
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("X.file"));
		Alien quellek = new Alien();
		out.writeObject(quellek);
	}
} /// :~