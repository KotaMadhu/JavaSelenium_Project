package loops.Mar;

import java.util.Scanner;

public class PrimeNumbersUsingWhileLoop {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scan.nextInt(); 
		int factorcount=0;
		int i=1;
		while(i<=n) 
		{
			if(n%i==0)	
			{
				System.out.println(i); 
				factorcount++;
			}
			i++;
		}
		System.out.println("Total factors:"+factorcount);
		if(factorcount==2)
			System.out.println("Prime Number");
		else
			System.out.println("No Prime Number");

	}

}
