package com.cab.task;
import java.util.*;

public class CabFareCalc {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the km: ");
        int kilometre= scanner.nextInt();
        System.out.print("Enter Cab Type (Micro/Mini/Prime): ");
        String type = scanner.next();
        st
        
        double Amount = 0;
        switch (type.toLowerCase()) {
            case "micro":
                Amount = kilometre* 10;
                break;
            case "mini":
                Amount = kilometre * 15;
                break;
            case "prime":
                Amount = kilometre * 20;
                break;
            default:
                System.out.println("Invalid cab type!");
                return;
        }
        System.out.println("Cab Fare: Rs. " + Amount);

        
         
        double discountamount = 0;
        if (Amount > 2000 && Amount <= 5000)
        {
            discountamount = Amount * 0.02; 
        } 
        else if (Amount > 5000) 
        {
            discountamount = Amount * 0.05;
        }

        System.out.println("Discount: Rs. " + discountamount);

        double finalBill = Amount - discountamount;
        System.out.println("Final Bill Amount after Discount: Rs. " + finalBill);

        scanner.close();
    }
}

