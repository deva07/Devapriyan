package Deva;

import java.util.Scanner;

public class Countnum1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		a=sc.nextInt();
	    int count=0;
	    int sum=0;
	    while(a!=0)
	    {
	    	int b=a%10;
	        sum=sum+b;
	    	a=a/10;
	    	count++;
	    }
	    System.out.println(count);
	}

}
