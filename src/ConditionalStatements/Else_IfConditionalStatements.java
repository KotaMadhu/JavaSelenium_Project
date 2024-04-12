package ConditionalStatements;

public class Else_IfConditionalStatements {

	public static void main(String[] args) 
	{
		int a=10,b=20,c=30,d=40;
		
		if(a>b) {
			System.out.println("A");
		}
		else if(c<a) {
			System.out.println("B");
		}
		else if(d>c) {
			System.out.println("C");
		}
		else if(b>c) {
			System.out.println("D");
		}
		else {
			System.out.println("Done");
		}
	}

}
