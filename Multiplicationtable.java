package com.task.task;

import java.util.*;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the table:");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			int k = n * i ;
			System.out.println(n + "*" + i + "=" + k);		
	}
	}
}
