package com.task.task;

import java.util.Scanner;

public class ClassForStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String 1:");
		String str1 =s.next();
		System.out.println("Enter the String 2:");
		String str2 =s.next();
		System.out.println("The repeated count values:"+str1.repeat(1));
	}
}