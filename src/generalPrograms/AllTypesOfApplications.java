package generalPrograms;

public class AllTypesOfApplications {

	public static void main(String[] args) {
		String str="Hyderabad is one " ;
		String str2="Best city in India";
		String str3="Cars@Buses@Lorrys@Bikes@Vans";
		StringBuffer x=new StringBuffer(str);
		System.out.println(x.reverse());
		
		System.out.println(str.contains("one"));
		System.out.println(str);
		System.out.println(str.concat(str2));
		
		String z[]=str3.split("@");
		System.out.println(z[0]);
		System.out.println(z[1]);
		System.out.println(z[2]);
		System.out.println(z[3]);

	}

}
