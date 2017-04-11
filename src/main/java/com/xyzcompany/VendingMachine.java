package com.xyzcompany;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class VendingMachine {

	private State acceptMoneyState;
	private State outOfOrderState;
	private State hasMoneyState;
	
	private State state;
	
	private double insertedAmount = 0.00;
	private Set<Product> products;
	private Deque<Coin> returnedCoins;
	
	public VendingMachine(Set<Product> products) {
		this.products = products;
		if(this.products == null) {
			this.products = new HashSet<Product>();
		}
		acceptMoneyState = new AcceptMoneyState(this);
		hasMoneyState = new HasMoneyState(this);
		outOfOrderState = new OutOfOrderState(this);
		
		returnedCoins = new ArrayDeque<Coin>();
		
		if(this.products.size() > 0) {
			state = acceptMoneyState;
		}else {
			state = outOfOrderState;
		}
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Set<Product> getProducts() {
		return products;
	}

	public void setProducts(Set<Product> products) {
		this.products = products;
	}

	public double getInsertedAmount() {
		return insertedAmount;
	}

	public void setInsertedAmount(double insertedAmount) {
		this.insertedAmount = insertedAmount;
	}
	
	public Deque<Coin> getReturnedCoins() {
		return returnedCoins;
	}

	public void setReturnedCoins(Deque<Coin> returnedCoins) {
		this.returnedCoins = returnedCoins;
	}

	public State getHasMoneyState() {
		return hasMoneyState;
	}

	public void setHasMoneyState(State hasMoney) {
		this.hasMoneyState = hasMoney;
	}

	public State getAcceptMoneyState() {
		return acceptMoneyState;
	}

	public void setAcceptMoneyState(State acceptMoney) {
		this.acceptMoneyState = acceptMoney;
	}

	public State getOutOfOrderState() {
		return outOfOrderState;
	}

	public void setOutOfOrderState(State outOfOrder) {
		this.outOfOrderState = outOfOrder;
	}

	public void rejectCoin(Coin coin) {
		returnedCoins.push(coin);
		System.out.println("REJECTING COIN: I do not accept " + coin);
	}
	
	public boolean isValidCoin(Coin coin) {
		return coin != Coin.PENNY;
	}

}
