package com.promotionengine.execute;

import com.promotionengine.calculation.CalculateCost;

public class ExecutePromotionEngine {
	private CalculateCost calc;
	private int total;
	private int option;

	public ExecutePromotionEngine(CalculateCost calc) {
		this.total = 0;
		this.calc = calc;
		this.option = 1;
	}

	public int execute(int skuIdA, int skuIdB, int skuIdC, int skuIdD) {
		switch (option) {
			case 1:
				total = calc.calculateTotalCost(skuIdA, skuIdB, skuIdC, skuIdD);
				break;
			default:
				break;
		}

		return total;
	}

}
