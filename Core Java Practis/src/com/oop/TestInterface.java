package com.oop;

interface iOne {
	int i = 10;
	default public void name(){
		System.out.println("in iOne");
	}
}

interface iTwo {
	int i = 10;
	int k = 10;
	default public void name(){
		System.out.println("in itwo");
	}
}

/*interface iThree extends iOne, iTwo{
	int k = 10;

	@Override
	default void name() {
		// TODO Auto-generated method stub
		iTwo.super.name();
	}
}*/

public class TestInterface implements iTwo, iOne {

	public static void main(String[] args) {
		iOne testInterface = new TestInterface();
		testInterface.name();
		System.out.println();
	}

	@Override
	public void name() {
		iTwo.super.name();
	}

	
	
	
}
