package com.java.programming;
import java.util.*;

public class GreatestNumber {
	
	public String great(int a,int b)
	{
		String result = a>b ? a+" is greater number" : b+" is greater number";
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a = sc.nextInt();
		int b= sc.nextInt();
		GreatestNumber g = new GreatestNumber();
		System.out.println(g.great(a, b));
	}

}
