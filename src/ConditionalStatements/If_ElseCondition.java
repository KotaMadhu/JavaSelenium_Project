package ConditionalStatements;

import java.util.Scanner;

public class If_ElseCondition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int i=s.nextInt();
		if(i%2==0) {
			System.out.println(i+":It is Even Number:");
		}
		else
		{
			System.out.println(i+":It is Odd Number");
		}
	}

}
