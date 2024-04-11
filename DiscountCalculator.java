package com.cab.task;

public class DiscountCalculator {


		// TODO Auto-generated method stub
		public static double applyDiscount(double cabFare) 
	    {

	        double discount = 0;
            if (cabFare > 5000)
	        {
               discount = 0.05 * cabFare;
             } 
            else if (cabFare > 2000) {

	            discount = 0.02 * cabFare;
	        }
            return discount;
	    }
	}


