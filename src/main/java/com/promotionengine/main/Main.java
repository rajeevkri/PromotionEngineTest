
package com.promotionengine.main;

import java.util.Scanner;

import com.promotionengine.calculation.CalculateCost;
import com.promotionengine.execute.ExecutePromotionEngine;


public class Main {


	public static void main(String[] args) {
		CalculateCost calc = new CalculateCost();
		ExecutePromotionEngine engine = new ExecutePromotionEngine(calc);
		
		System.out.println(" ############### Welcome to XYZ Promotion Engine ############## ");

		Scanner sc = new Scanner(System.in);


		System.out.println("Enter quantity value of SKUID A");
		int skuIdA = sc.nextInt();

		System.out.println("Enter quantity value of SKUID B");

		int skuIdB = sc.nextInt();

		System.out.println("Enter quantity value of SKUID C");

		int skuIdC = sc.nextInt();

		System.out.println("Enter quantity value of SKUID D");

		int skuIdD = sc.nextInt();
		
		int total = engine.execute(skuIdA, skuIdB, skuIdC, skuIdD);
		
		System.out.println(" ######### Total Calculated Cost ==== >>> " + total);
		
	}
	
	
}
