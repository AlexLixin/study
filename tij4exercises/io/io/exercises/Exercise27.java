/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 23, 2019
 *
 ************************************************************************/
package io.exercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializedClass1 implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;
	private SerializedClass2 s;

	public SerializedClass1(String name, SerializedClass2 s) {
		super();
		this.name = name;
		this.s = s;
	}

	@Override
	public String toString() {
		return "SerializedClass: " + name;
	}

}

class SerializedClass2 implements Serializable{
	private static final long serialVersionUID = -500367339089343836L;

}

public class Exercise27 {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e27.txt"));
			oos.writeObject(new SerializedClass1("first", new SerializedClass2()));
			oos.flush();
			oos.close();
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e27.txt"));
			Object readObject = ois.readObject();
			System.out.println(readObject);
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
