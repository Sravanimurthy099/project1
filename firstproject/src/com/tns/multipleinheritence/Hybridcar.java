package com.tns.multipleinheritence;

public class Hybridcar implements CngCar,PetrolCar {

	@Override
	public void PetrolKit() {
		// TODO Auto-generated method stub
		System.out.println("using petrolkit to drive  Hybrid Car");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Driving Hybrid Car");
		
	}

	@Override
	public void CngkKit() {
		// TODO Auto-generated method stub
		System.out.println("using cngkit to drive  Hybrid Car");
		
	}

}
