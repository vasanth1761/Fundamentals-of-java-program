package com.task1.day1;
import java.util.*;
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the age :");
		int age = sc.nextInt();
		
		/*validation for  age
		if(age<0 && age >100)
		{
			System.out.println("Please enter the valid data");
		}*/
		if(age>0 && age<100)
		{
		//validation	
		
	    System.out.print("Enter the sex (M/F) :");
		char sex=sc.next().charAt(0);
		
        //validation for male or female
		if(sex=='M' || sex=='F'||sex=='f'||sex=='m')
		{
		System.out.print("Are you married (Y /N) :");
		char married=sc.next().charAt(0);
		
		
		//validation for yes or No
		if(married=='Y'||married=='N'||married=='y'||married=='n')
		{
		if(sex == 'f'||sex=='F')
		{
			System.out.println("Work Location Location:urban area ");
		}
		else if(sex=='m'||sex=='M')
		{
			  if(age>20 && age<40)
				{
					System.out.println("Work Location:anyArea ");
				}
			  else if(age>40 && age<60)
			        System.out.println("Work Location :anywhere");
			  else
			  {
			         System.out.print("ERROR");
			  }
		}
	  
		else
		{
			System.out.println("ERROR");
		}
		}
		
		}
		}
		else
		System.out.println("Please enter the valid data");
		
		
	}

}
