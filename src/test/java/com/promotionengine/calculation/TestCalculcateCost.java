package com.promotionengine.calculation;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestCalculcateCost {
	
	private CalculateCost testee = new CalculateCost();
	
	
	@Test
	public void testCalculation1() {
		int result = testee.calculateTotalCost(5,5,1,0);
		
		assertThat(result).isEqualTo(370);
	}
	
	@Test
	public void testCalculation2() {
		int result = testee.calculateTotalCost(5,6,5,4);
		
		assertThat(result).isEqualTo(505);
	}
	
	@Test
	public void testCalculation3() {
		int result = testee.calculateTotalCost(3,5,1,1);
		
		assertThat(result).isEqualTo(280);
	}
	
	@Test
	public void testCalculation4() {
		int result = testee.calculateTotalCost(1,1,1,0);
		
		assertThat(result).isEqualTo(100);
	}
	
	@Test
	public void testCalculation5() {
		int result = testee.calculateTotalCost(5,5,3,5);
		
		assertThat(result).isEqualTo(470);
	}

}
