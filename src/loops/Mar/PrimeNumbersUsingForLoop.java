package loops.Mar;

import java.util.Scanner;

public class PrimeNumbersUsingForLoop {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=scan.nextInt(); 
		int factorcount=0;
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0)	
			{
				System.out.println(i); 
				factorcount++;	
			}
		}
		System.out.println("Total factors:"+factorcount);
		if(factorcount==2)
			System.out.println("Prime Number");
		else
			System.out.println("No Prime Number");

	}

}
