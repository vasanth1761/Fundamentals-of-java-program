package com.task1.day1;
import java.util.*;
public class EvenNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no:");
        int n=sc.nextInt();
        

        //validation
        if(n<0)
		{
			System.out.printf("Enter the valid Data");
		}
        if(n>0)
        {	
        int rem,label=0;
        while(n>0)
        {
        	rem=n%10;
        	label=label+rem;
        	if(label%2==0)
        		System.out.println("The Even no is:" +label);
        	    n=n/10;
        	    label=0;
        }
	}}

}
