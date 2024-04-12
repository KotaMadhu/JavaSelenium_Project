package operators.Feb;

public class ComparisonOperator {

	public static void main(String[] args) 
	{
		int a=100,b=200,c=300,d=100,e=500;
		
		System.out.println(a==c);//false
		System.out.println(a==d);//true
		System.out.println(a!=c);//true
		System.out.println(d<b);//true
		System.out.println(b>d);//true
		System.out.println(b>=a);//true
		System.out.println(e<=d);//false
		System.out.println(c!=e);//true
		System.out.println(a>=d);//true
		
	}

}
