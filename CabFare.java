package com.cab.task;
import java.util.*;
public class CabFare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the user name:");
		String name=sc.next();
		System.out.println("Enter the km:");
		int km=sc. nextInt();
		System.out.println("Enter the cab type(prime-1/mini-3/micro-2):");
		int cabtype=sc.nextInt();
        if(cabtype==1)
        {
		prime(km);
        }
        else if(cabtype==2)
        {
		micro(km);
        }
        else if(cabtype==3)
        {
		mini(km);
        }
		
	}

public static void prime(int km) {
	double totalamount;
	double discount;
	totalamount=km*20;
	if(km>=2000) 
	{
		discount=2/100*totalamount;
		totalamount=totalamount-discount;
        System.out.println("the total amount:"+totalamount);
	   
	}
	
}

public static void micro(int km) {
	double totalamount;
	double discount;
	totalamount=km*20;
	if(km>=2000) 
	{
		discount=totalamount-2/100*totalamount;

		System.out.println("the total amount:"+totalamount);
     }
}

public static void mini(int km) {
	double totalamount;
	double discount;
	totalamount=km*20;
	if(km>=2000) 
	{
		discount=totalamount-2/100*totalamount;
		System.out.println("the total amount:"+totalamount);
	}
}
}



