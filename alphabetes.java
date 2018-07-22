package white;

import java.util.Scanner;

public class Alphabetes {
	public static void main(String[] args)
	{
		char c;
		Scanner sc=new Scanner(System.in);
		c=sc.next().charAt(0);
		if(c>='a' && c<='z')
		{
			System.out.println("alphabetes");
		}
		else
		{
			System.out.println("not alphabetes");
		}
	}

}
