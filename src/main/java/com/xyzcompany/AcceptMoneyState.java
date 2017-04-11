package com.xyzcompany;

public class AcceptMoneyState extends State {

	public AcceptMoneyState(VendingMachine vendingMachine) {
		super(vendingMachine);
	}
	
	@Override
	public void processInsertCoin(Coin coin) {
		System.out.println("You have inserted: " + coin.getValue());
		vendingMachine.setInsertedAmount(vendingMachine.getInsertedAmount() + coin.getValue());
		vendingMachine.setState(vendingMachine.getHasMoneyState());
	}
	

}
