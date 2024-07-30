package com.java.programming;
import java.util.*;
public class OddOrEven {

	public String oddOrEven(int a)
	{
		if(a%2 == 0)
		{
			return a+" is even";
		}
		else {
			return a+" is odd";
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		OddOrEven e = new OddOrEven();
		System.out.println(e.oddOrEven(num));
	}

}
