package com.cab.task;
import java.util.*;

public class Cab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);



        System.out.print("Enter the km: ");
        double kilometre = scanner.nextDouble();



        System.out.print("Enter Cab Type(prime / micro /macro: ");
        String cabType = scanner.next();


        //methods to check cabtypes
        double cabFare = FareCalculator.calculateCabFare(kilometre, cabType);
        if (cabFare ==-1)
        {
         System.out.println("Invalid cab type.");
        }
        
        //methods to calculate discount
        double discount = DiscountCalculator.applyDiscount(cabFare);
        double finalBill = cabFare- discount;

         System.out.println("Cab Fare: Rs." + cabFare);
         System.out.println("Discount Applied: Rs." + discount);
         System.out.println("Final Bill Amount: Rs." + finalBill);
         scanner.close();

    }

}

   
