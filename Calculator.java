package com.hospital.day2;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the operators:+,-,*,/:");
		char operator=sc.next().charAt(0);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		switch(operator) {
		case '+':
			n3=n1+n2;
			System.out.println("Answer:"+n3);
			break;
		case'-':
			n3=n1-n2;
			System.out.println("Answer:"+n3);
			break;
		case'*':
			n3=n1*n2;
			System.out.println("Answer:"+n3);
			break;
		case'/':
			n3=n1/n2;
			System.out.println("Answer:"+n3);
			break;
		
		}
		
		

	}

}
