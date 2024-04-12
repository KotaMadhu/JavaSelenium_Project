package stringFunctions;

public class FunctionsOfTheStrings {

	public static void main(String[] args) {
		String str1="Hi hero how are you?";
		String str2="Hi Hello iam good";
		String str3="What about you?";
		String str4="Iam good and What about you";
		String str5="Hi Hello iam good";
		String str6="Hi hello Iam Good";
		
		System.out.println(str1.length());
		System.out.println(str2.equals(str5));
		System.out.println(str2.equalsIgnoreCase(str6));
		System.out.println(str3.contains("about"));
		System.out.println(str3.concat(str4));
		System.out.println(str5.startsWith("Hi"));
		System.out.println(str5.endsWith("good"));
		System.out.println(str3.charAt(9));
		
		StringBuffer x= new StringBuffer(str4);
		System.out.println(x.reverse());
		String s="              Selenium              ";
		System.out.println(s.trim());

	}

}
