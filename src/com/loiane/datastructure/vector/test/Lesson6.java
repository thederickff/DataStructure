package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.Vector;

public class Lesson6 {

	public static void main(String[] args) {
		
		Vector vector = new Vector(10);

		vector.add("First Element");
		vector.add("Second Element");
		vector.add("Third Element");
		
		System.out.println(vector.search("First Elemednt"));
		System.out.println(vector.search("Third Element"));
	}

}
