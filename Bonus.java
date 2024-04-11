package com.task1.day1;
import java.util.*;

public class Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the salary:");
		int salary=sc.nextInt();
		
		//validation
				if(salary<0)
				{
					System.out.println("Enter the valid data");
				}
				if(salary>0)
				{
		//validation
					
		System.out.println("Enter the year of service:");
		int service=sc.nextInt();
		if(service>5)
		{
			int bonus = salary * 5/100;
			bonus=bonus+salary;
			System.out.println("The net bonus is:" +bonus);
			
		}
		else
		{
			System.out.println("Sorry you dont have bonus");
		}
	}		

	}
}


