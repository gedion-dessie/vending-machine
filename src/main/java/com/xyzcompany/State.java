package com.xyzcompany;

public abstract class State {
	
	protected VendingMachine vendingMachine;
	
	public State(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	public void insertCoin(Coin coin) {
		if(vendingMachine.isValidCoin(coin)) {
			processInsertCoin(coin);
		}else {
			vendingMachine.rejectCoin(coin);
		}
	}
	
	public abstract void processInsertCoin(Coin coin);
}
