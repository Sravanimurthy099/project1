package com.tnsif.interfaces;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Amazon ob=new Amazon();//cannot instantiate type amazon
		//Amazon.aboutUs();
		Amazon a;
		//a=new NonPrime();
		a=new Prime();
		a.welcome();
		a.subscribe();
		//a.serviceCharge();
		a=new NonPrime();
		
		a.welcome();
		a.serviceCharge();
		
		a.subscribe();

	}

}
