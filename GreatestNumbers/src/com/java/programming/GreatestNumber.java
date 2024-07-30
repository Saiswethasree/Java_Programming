package com.java.programming;
import java.util.*;
public class GreatestNumber {

	public String great(int a,int b,int c,int d,int e) 
	{
		String result = a>b&&a>c&&a>d&&a>e ? a+"is greatest number" : b>c&&b>d&&b>e ? b+"is greatest number" :c>d&&c>e ? c+"is greatest number" : d>e ? d+"is greatest number": e+"is greatest number";
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the values");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		GreatestNumber g = new GreatestNumber();
		System.out.println(g.great(num1,num2,num3,num4,num5));
	}

}
