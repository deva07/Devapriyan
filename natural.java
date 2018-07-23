package Deva;

import java.util.Scanner;

public class Natualnum {
	public static void main(String[] args)
	{
		int a;
		Scanner sc=new Scanner(System.in);
		int sum=0;
		a=sc.nextInt();
		for(int i=0;i<=a;i++)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
