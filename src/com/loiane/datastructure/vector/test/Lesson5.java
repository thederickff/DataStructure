package com.loiane.datastructure.vector.test;

import com.loiane.datastructure.vector.Vector;

public class Lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vector = new Vector(10);

		vector.add("First Element");
		vector.add("Second Element");
		vector.add("Third Element");
		
		System.out.println(vector.search(300));
	}

}
