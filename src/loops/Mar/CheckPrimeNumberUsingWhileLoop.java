package loops.Mar;

import java.util.Scanner;

public class CheckPrimeNumberUsingWhileLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			if(n%i==0) {
				System.out.println("Factors:"+i);
			}
			i++;
		}

	}

}
