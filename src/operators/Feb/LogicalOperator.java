package operators.Feb;

public class LogicalOperator {

	public static void main(String[] args) {
		int a=100,b=200,c=300,d=400,e=500;
		
		System.out.println(a>b && b<c);//false
		System.out.println(d>c && b<c);//true
		System.out.println(a<=c && d<=e);//true
	
		System.out.println(a>c || d<b);//false
		System.out.println(d<e || b<c);//true
		System.out.println(b>=e || d<=a);//false
		System.out.println(!(a==b));//true
		
		
		

	}

}
