package priyan;

import java.util.Scanner;

public class Maxvalue {
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n;
		n=sc.nextInt();
		System.out.println("element");
		
		int i;
		int[] a=new int[n];
		for( i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for( i=0;i<n;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
	}

}
