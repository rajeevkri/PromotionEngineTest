package com.promotionengine.calculation;

import com.promotionengine.constant.Constants;

public class CalculateCost {

	public int calculateTotalCost(int quantA, int quantB, int quantC, int quantD) {
		int total = 0;
		total = calculateSkuIdA(quantA, total);
		total = calculateSkuIdB(quantB, total);
		total = calculateSkuIdCAndD(quantC, quantD, total);
		return total;
	}

	private int calculateSkuIdA(int quantA, int total) {
		if (quantA >= 3) {
			int quotient = quantA / 3;
			int remainder = quantA % 3;

			total = (quotient >= 0) ? total + quotient * Constants.PRICE_COMBO_SKUA : total;

			total = (remainder >= 0) ? total + remainder * Constants.PRICE_SKUA : total;
		} else {

			total = total + quantA * Constants.PRICE_SKUA;
		}

		return total;
	}

	private int calculateSkuIdB(int quantB, int total) {
		if (quantB >= 2) {
			int quotient = quantB / 2;
			int remainder = quantB % 2;
			total = (quotient >= 0) ? total + quotient * Constants.PRICE_COMBO_SKUB : total;
			total = (remainder >= 0) ? total + remainder * Constants.PRICE_SKUB : total;
		} else {
			total = total + quantB * Constants.PRICE_SKUB;
		}
		return total;
	}

	private int calculateSkuIdCAndD(int quantC, int quantD, int total) {
		if (quantC >= 1 && quantD >= 1) {
			total = (quantC == quantD) ? total + quantC * Constants.PRICE_COMBO_SKUCD : total;
			total = (quantC > quantD)
					? total + (quantD * Constants.PRICE_COMBO_SKUCD + (quantC - quantD) * Constants.PRICE_SKUC)
					: total;
			total = (quantD > quantC)
					? total + (quantC * Constants.PRICE_COMBO_SKUCD + (quantD - quantC) * Constants.PRICE_SKUD)
					: total;
		} else {
			total = total + quantC * Constants.PRICE_SKUC;
			total = total + quantD * Constants.PRICE_SKUD;
		}
		return total;
	}

}
