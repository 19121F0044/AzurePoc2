package com.kumaran;


import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter range of number");
		int n=scn.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(i+" ");
			
			sum+=i;
			
		}
		System.out.println("\nSum of the above numbers is given below");
		System.out.println(sum);
	}

}
