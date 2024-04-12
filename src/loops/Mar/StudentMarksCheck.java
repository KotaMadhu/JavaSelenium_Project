package loops.Mar;

import java.util.Scanner;

public class StudentMarksCheck {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Enter Marks:");
			int marks=s.nextInt();
			
		if(marks>=35) {
			System.out.println("Student is Pass:"+marks);
		}
		else
		{
			System.out.println("Student is Fail:"+marks);
		}
		}
	}

}
