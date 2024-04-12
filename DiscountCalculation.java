package com.task1.day1;
import java.util.*;

public class DiscountCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total quantity:");
		double quantity=sc.nextDouble();
		while(true)
			if(quantity>0)
		    {
			break;
		    }
			else
			{
				System.out.println("Enter the proper data:");
				quantity=sc.nextDouble();
			}
		double totalcost,percentage,total;
		totalcost=quantity*100;
		if(totalcost>1000)
		{
			percentage=(totalcost*0.1);
			total=totalcost-percentage;
			System.out.println("The total amount with dicount:"+total);
		}
		else
		{
			System.out.println("Total amount is:"+totalcost);
			System.out.println("SORRY!you dont have discount");
		}
		
		
		

	}

}
