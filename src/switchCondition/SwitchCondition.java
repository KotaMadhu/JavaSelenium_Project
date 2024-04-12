package switchCondition;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		for(int i=1;i<=10;i++) {
			System.out.println("Enter Course");
			String course=s.next();
			
		switch(course.toUpperCase()) {
		case "JAVA":
			System.out.println("Course is available:"+course);
			break;
		case "SELENIUM":
			System.out.println("Course is available:"+course);
			break;
		case "MANUAL":
			System.out.println("Course is available:"+course);
			break;
		case "PYTHON":
			System.out.println("Course is available:"+course);
			break;
			
			default:
				System.out.println("Course is not avilable: "+course);
		}
		}

	}

}
