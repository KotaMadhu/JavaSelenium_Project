package arrays.March;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int x[]=new int[5];
		x[0]=100;
		x[1]=200;
		x[2]=300;
		x[3]=400;
		x[4]=500;
		
		//Print length of array
		System.out.println("Size of array:"+x.length);
		System.out.println("===================");
		//Print Specific value from array
		System.out.println("Specific value:"+x[2]);
		System.out.println("===================");
		for (int each : x) {
			System.out.println(each);			
			}
			
		System.out.println("===================");
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}

	}

}
