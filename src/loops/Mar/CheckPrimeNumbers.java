package loops.Mar;

import java.util.Scanner;

public class CheckPrimeNumbers {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println("Factors:"+i);
			}
			
		}

	}

}
