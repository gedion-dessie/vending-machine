package com.xyzcompany;

public class OutOfOrderState extends State {

	
	public OutOfOrderState(VendingMachine vendingMachine) {
		super(vendingMachine);
	}

	@Override
	public void processInsertCoin(Coin coin) {
		System.out.println("Out of Order! You can't insert coins!");
	}
	

}
