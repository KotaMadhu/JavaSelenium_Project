package stringFunctions;

public class SpiltFunction {

	public static void main(String[] args) {
		String str = "QEdge@Software Testing";
		String x[]=str.split("@");
		System.out.println(x[0]);
		System.out.println(x[1]);
		
		System.out.println("___________________________");
		for (String each : x) {
			System.out.println(each);
			
		}
		
		System.out.println("___________________________");
		
		String st = "Software/Manual/Automation/Selenium";
		String y[]=st.split("/");
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);
		System.out.println(y[3]);
		
		System.out.println("___________________________");
		
		String s="9666880/9703930/8686054/9346961";
		String z[]=s.split("/");
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[2]);
		System.out.println(z[3]);
		
		
	}

}
