package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.Vector;

public class Lesson7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector vector = new Vector(7);

		vector.add("b");
		vector.add("c");
		vector.add("e");
		vector.add("f");
		vector.add("g");

		System.out.println(vector);

		vector.add(0, "a");

		System.out.println(vector);

		vector.add(5, "d");

		System.out.println(vector);
	}

}
