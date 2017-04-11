package com.xyzcompany;

public class HasMoneyState extends State {

	
	public HasMoneyState(VendingMachine vendingMachine) {
		super(vendingMachine);
	}

	@Override
	public void processInsertCoin(Coin coin) {
		vendingMachine.setInsertedAmount(vendingMachine.getInsertedAmount() + coin.getValue());
		System.out.println("You have inserted: " + vendingMachine.getInsertedAmount());
	}
	

}
