/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 25, 2019
 *
 ************************************************************************/
package io;

//: io/MyWorld.java
import java.io.*;
import java.util.*;
import static net.mindview.util.Print.*;

class House implements Serializable {

	private static final long serialVersionUID = 1L;
}

class Animal implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private House preferredHouse;

	Animal(String nm, House h) {
		name = nm;
		preferredHouse = h;
	}

	public String toString() {
		return name + "[" + super.toString() + "], " + preferredHouse + "\n";
	}
}

public class MyWorld {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		House house = new House();
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("Bosco the dog", house));
		animals.add(new Animal("Ralph the hamster", house));
		animals.add(new Animal("Molly the cat", house));
		print("animals: " + animals);
		ByteArrayOutputStream buf1 = new ByteArrayOutputStream();
		ObjectOutputStream o1 = new ObjectOutputStream(buf1);
		o1.writeObject(animals);
		o1.writeObject(animals); // Write a 2nd set
		//Write to a different stream:
		ByteArrayOutputStream buf2 = new ByteArrayOutputStream();
		ObjectOutputStream o2 = new ObjectOutputStream(buf2);
		o2.writeObject(animals);
		//Now get them back:
		ObjectInputStream in1 = new ObjectInputStream(new ByteArrayInputStream(buf1.toByteArray()));
		ObjectInputStream in2 = new ObjectInputStream(new ByteArrayInputStream(buf2.toByteArray()));
		List animals1 = (List) in1.readObject(), animals2 = (List) in1.readObject(), animals3 = (List) in2.readObject();
		print("animals1: " + animals1);
		print("animals2: " + animals2);
		print("animals3: " + animals3);
	}
}