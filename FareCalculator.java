package com.cab.task;

public class FareCalculator {
	 public static double calculateCabFare(double kilometre, String cabType) {
            double cabRate = 0;
            switch (cabType.toLowerCase()) 
            {
            case "Micro":
                 cabRate = 10;
                 break;
            case "Mini":
                 cabRate = 15;
                 break;
            case "Prime":
                 cabRate = 20;
                 break;
            default:
            	return -1;

	        }
            return kilometre* cabRate;

	    }
}
