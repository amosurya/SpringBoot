package com.oop;

class Parent{
	public void getParent() {
		System.out.println("in Parent getParent");
	}
	

}

public class Abstraction extends Parent{
	
	public void getParent() {
		System.out.println("in Child");
	}
	
	public void setParent(Parent p) {
		System.out.println("in Parent");
	}
	
	public void setParent(Abstraction a) {
		System.out.println("in Abstractio");
	}
	
	public static void main(String[] args) {
		
		Parent parent = new Abstraction();
		Abstraction abstraction = new Abstraction();
		abstraction.setParent(parent);
	}

}
