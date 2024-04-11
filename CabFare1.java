package com.cab.task;
import java.util.*;

public class CabFare1 {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the name:");
       String name=scanner.next();

        System.out.print("Enter the kilometer: ");
        double distance = scanner.nextDouble();
        System.out.println("Enter the cab type:");
        System.out.println("prime (20 rupees)");
        System.out.println("Micro (10 rupess)");
        System.out.println("Mini (15rupess)");
        System.out.print("Enter Cab Type: ");
        String cabType = scanner.next();

        double Amount = calculateCabFare(distance, cabType);

        if(Amount<0)
        {

            System.out.println("Invalid cab type.");
            

        } 

        double discount = applyDiscount(Amount);
        double finalBill = Amount- discount;
        System.out.println("Cab Fare: Rs." + Amount);
        System.out.println("Discount Applied: Rs." + discount);
        System.out.println("Final Bill Amount: Rs." + finalBill);
        
        scanner.close();
    }



    public static double calculateCabFare(double distance, String cabType) {

        double cabRate = 0;

        switch (cabType.toLowerCase()) {
         case "micro":
              cabRate = 10;
              break;
         case "mini":
              cabRate = 15;
              break;
         case "prime":
        	  cabRate = 20;
              break;
         default:
              return -1;
       }
return distance * cabRate;
}



    public static double applyDiscount(double Amount) {

        double discount = 0;
       if (Amount > 5000) 
       {
          discount = 0.05 * Amount;
       }  
        else if (Amount > 2000) 
       {
          discount = 0.02 * Amount;
       }
        return discount;
    }

}
