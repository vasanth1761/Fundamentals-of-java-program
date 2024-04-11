package com.task1.day1;
import java.util.*;
public class Raining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Is it is raining (Y/N):");
		char rain=sc.next().charAt(0);
		if(rain=='y'||rain == 'Y')
		{
			System.out.println("Bring an umbrella");
			System.out.print("Enter the temperature:");
			int temperature=sc.nextInt();
			if(temperature<32)
			{
				System.out.println("Bring an heavy project");
			}
			else if(temperature>32&&temperature<50);
			{
				System.out.println("Bring light jacket");
			}
			
			
				
			
		}
		else
		{
			System.out.println("no rain");
		}
		
	}
}
		