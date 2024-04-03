package com.tnsif.interfaces;
//Program to demonstrate interfaces

public interface Amazon {
	void welcome();
	void subscribe();//abstract methods
	default void serviceCharge()//features introduced in java8
	{
		int amt=100;
		System.out.println("the service charge is"+amt);
	}
	static void aboutUs() {
		System.out.println("its a ecomerce website");
		
	}
 // public Amazon() {  interfaces cannot have constructors
	  
  //}
}
