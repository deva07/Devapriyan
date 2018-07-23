package Deva;

import java.util.Scanner;

public class Powercalculate {
	public static void main(String[] args)
	{
		
		int a;
		int n;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		n=sc.nextInt();
		int b=(int) Math.pow(a,n);
		System.out.println(b);
	}

}
