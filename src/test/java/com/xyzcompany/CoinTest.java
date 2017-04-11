package com.xyzcompany;

import static org.junit.Assert.*;

import org.junit.Test;

import com.xyzcompany.Coin;

public class CoinTest {

	@Test
	public void testGetValue() {
		Coin coin = Coin.PENNY;
		assertEquals(coin.getValue(), 0.01, 0);
		
		coin = Coin.NICKEL;
		assertEquals(coin.getValue(), 0.05, 0);
		
		coin = Coin.DIME;
		assertEquals(coin.getValue(), 0.10, 0);
		
		coin = Coin.QUARTER;
		assertEquals(coin.getValue(), 0.25, 0);
	}

}
