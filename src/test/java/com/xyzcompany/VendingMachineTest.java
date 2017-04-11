package com.xyzcompany;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.xyzcompany.Coin;
import com.xyzcompany.Product;
import com.xyzcompany.State;
import com.xyzcompany.VendingMachine;

public class VendingMachineTest {

	private VendingMachine vendingMachine; 
	
	@Before
	public void setup() {
		Set<Product> products = new HashSet<Product>();
		Product cola = new Product(1.00,"Cola", 5);
		Product chips = new Product(0.50,"Chips", 5);
		Product candy = new Product(0.65,"Cola", 5);
		
		products.add(cola);
		products.add(chips);
		products.add(candy);

		vendingMachine = new VendingMachine(products);
	}
	
	@Test
	public void testGetState() {
		assertNotNull(vendingMachine.getState());
		assertTrue(vendingMachine.getState() instanceof State);
	}

	@Test
	public void testGetProducts() {
		assertNotNull(vendingMachine.getProducts());
	}

	@Test
	public void testGetInsertedAmount() {
		assertTrue(vendingMachine.getInsertedAmount() >= 0);
	}

	@Test
	public void testGetReturnedCoins() {
		assertNotNull(vendingMachine.getReturnedCoins());
	}

	@Test
	public void testGetHasMoneyState() {
		assertNotNull(vendingMachine.getHasMoneyState());
	}

	@Test
	public void testGetAcceptMoneyState() {
		assertNotNull(vendingMachine.getAcceptMoneyState());
	}


	@Test
	public void testIsValidCoin() {
		assertFalse(vendingMachine.isValidCoin(Coin.PENNY));
		assertTrue(vendingMachine.isValidCoin(Coin.NICKEL));
		assertTrue(vendingMachine.isValidCoin(Coin.DIME));
		assertTrue(vendingMachine.isValidCoin(Coin.QUARTER));
	}

}
