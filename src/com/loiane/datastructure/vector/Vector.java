package com.loiane.datastructure.vector;



public class Vector {

	private String[] elements;
	private int size;

	public Vector(int capacity) {
		this.elements = new String[capacity];
		this.size = 0;
	}

	/*
	 * public void add(String element) {
	 * 
	 * for (int i = 0; i < this.elements.length; i++) { if (this.elements[i] ==
	 * null) { this.elements[i] = element; break; } }
	 * 
	 * }
	 */

	/*
	 * public void add(String element) throws Exception{
	 * 
	 * if(this.size < this.elements.length){
	 * 
	 * this.elements[this.size] = element; this.size++;
	 * 
	 * } else { throw new
	 * Exception("Vector is full, it is not possible to add any element!"); }
	 * 
	 * }
	 */
	
	// Add
	public boolean add(String element) {
		increaseCapacity();
		if (this.size < this.elements.length) {
			this.elements[this.size] = element;
			this.size++;
			return true;
		} else {
			return false;
		}

	}

	public boolean add(int index, String element) {
		
		increaseCapacity();
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid index!");
		}
		// move the elements to the next index
		for (int i = this.size; i > index; i--) {
			this.elements[i] = this.elements[i - 1];
		}

		this.elements[index] = element;
		this.size++;

		return true;
	}

	public void increaseCapacity() {
		if (this.elements.length == this.size) {
			String[] newElements = new String[this.elements.length * 2];

			for (int i = 0; i < this.elements.length; i++) {
				newElements[i] = this.elements[i];
			}

			this.elements = newElements;
		}
	}
	// Search
	public String search(int index) {
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid index!");
		}
		return this.elements[index];
	}

	public int search(String s) {

		for (int i = 0; i < this.elements.length; i++) {
			if (s.equals(this.elements[i])) {
				return i;
			}
		}

		return -1;
	}
	
	
	// Remove
	public void removeItem(int index){
		if (!(index >= 0 && index < this.size)) {
			throw new IllegalArgumentException("Invalid index!");
		}
		
		for(int i = index; i < size-1;i++){
			this.elements[i] = this.elements[i+1];
		}
		this.size--;
	}
	public void removeItem(String itemName){
		int index = search(itemName);
		
		if(index > -1){
			removeItem(index);
		}
	}

	public int getSize() {
		return this.size;
	}

	@Override
	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i = 0; i < this.size - 1; i++) {
			s.append(this.elements[i]);
			s.append(", ");
		}
		if (this.size > 0) {
			s.append(this.elements[this.size - 1]);
		}
		s.append("]");
		return s.toString();
	}

}
