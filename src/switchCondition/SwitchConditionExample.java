package switchCondition;

import java.util.Scanner;

public class SwitchConditionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int i=1;
		while (i<=5) {
			
			System.out.println("Enter Subject");
			String subject=s.next();
			
		switch (subject.toUpperCase()) {
		case "TELUGU":
			System.out.println("Subjects in SSC:"+subject);			
			break;
		case "HINDI":
			System.out.println("Subjects in SSC:"+subject);			
			break;
		case "ENGLISH":
			System.out.println("Subjects in SSC:"+subject);			
			break;
		case "MATHEMATICS":
			System.out.println("Subjects in SSC:"+subject);			
			break;
		case "SCEINCE":
			System.out.println("Subjects in SSC:"+subject);			
			break;
		case "SOCIAL":
			System.out.println("Subjects in SSC:"+subject);			
			break;
			
		default:
			System.out.println("Subjects not in SSC:"+subject);	
			break;
		}
		i++;
		}

	}

}
