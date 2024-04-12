package stringFunctions;

public class UsingAllStringFunctions {

	public static void main(String[] args) {
		String str1="We are learning software Testing";
		String str2="Mainly it have Manual and Automation Testing";
		String str3="It contains Verification and Validation";
		String str4="Functional Testing and Non Functional Testing";
		String str5="White Box Testing and Block Box Testing";
		String str6="We are learning Java with Selenium";
		String str7="Data types,Variables,Operators,Loops,Arrays,String Functions";
		String str8="We are Learning software Testing";
		String str9="Mainly it have Manual and Automation Testing";
		String str10="            Java with selenium";
		String str11="            Java with selenium  	        ";
		String str12="Java with selenium     			     ";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println("__________________________");
		System.out.println(str4.startsWith("Functional"));
		System.out.println(str2.startsWith("Mainly"));
		System.out.println(str5.startsWith("It"));
		System.out.println("__________________________");
		System.out.println(str1.endsWith("Testing"));
		System.out.println(str2.endsWith("Testing"));
		System.out.println(str1.endsWith("software"));
		System.out.println("__________________________");
		System.out.println(str1.equals(str8));
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str4));
		System.out.println("__________________________");
		System.out.println(str1.equalsIgnoreCase(str8));
		System.out.println(str2.equalsIgnoreCase(str5));
		System.out.println(str4.equalsIgnoreCase(str5));
		System.out.println("__________________________");
		System.out.println(str1.concat(str2));
		System.out.println(str1.concat(str3));
		System.out.println(str1.concat(str4));
		System.out.println("__________________________");
		System.out.println("__________________________");
		System.out.println(str1.contains("Manual"));
		System.out.println(str2.contains("software"));
		System.out.println(str1.contains("I"));
		System.out.println("__________________________");
		System.out.println("__________________________");
		System.out.println(str1.charAt(1));
		System.out.println(str1.charAt(4));
		System.out.println(str1.charAt(3));
		System.out.println("__________________________");
	
		StringBuffer x=new StringBuffer(str1);
		System.out.println(x.reverse());
		System.out.println("__________________________");
		System.out.println(str10.trim());
		System.out.println(str11.trim());
		System.out.println(str12.trim());
		
		
		
		
	}

}
