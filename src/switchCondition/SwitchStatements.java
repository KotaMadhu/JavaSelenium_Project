package switchCondition;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Heroine name");
		int i=1;
		while (i<=5) {
			
		String heroines=s.next();
		switch (heroines.toLowerCase()) {
		case "saipallavi":
			System.out.println("She is a heroine");
			break;
		case "soundarya":
			System.out.println("She is a heroine");
			break;
		case "anushka":
			System.out.println("She is a heroine");
			break;
		case "sreeleela":
		System.out.println("She is a heroine");
		break;

		default:
			System.out.println("She is not a heroine");
			break;
		}
		i++;
		}

	}

}
