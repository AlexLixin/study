/************************************************************************
 *
 * Initial Creation:
 *    Author      LXI
 *    Created on  May 15, 2019
 *
 ************************************************************************/
package io.exercises;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise7 {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader(new File("io/io/exercises/Exercise7.java")); 
		BufferedReader br = new BufferedReader(fr);
		List<String> list = new ArrayList<>();
		String s;
		while ((s= br.readLine())!=null) {
			list.add(s);
		}
		Collections.reverse(list);
		for (String string : list) {
			System.out.println(string);
		}
		
	}
}
