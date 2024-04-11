package com.hospital.day2;
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the bank name:");
		String bank=sc.next();
		System.out.println("The bank name is:"+bank);
		System.out.println("Enter the branch name:");
		String branch = sc.next();
		System.out.println("The branch name is:"+branch);
		System.out.println("Enter the IFSC code:");
		String code=sc.next();
		System.out.println("The Ifsc code is:"+code);
		System.out.println("Enter the Holder name:");
		String name=sc.next();
		System.out.println("The holder name is:"+name);
		System.out.println("Enter the Account number :");
		long accountno=sc.nextLong();
		System.out.println("The account no is:"+accountno);
		System.out.println("Does the holder already have an account?");
		boolean hasalready=sc.nextBoolean();
		System.out.println(hasalready);
		
		
		
		
		
		
		
		

	}

}
