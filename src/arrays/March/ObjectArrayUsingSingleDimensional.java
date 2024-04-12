package arrays.March;

public class ObjectArrayUsingSingleDimensional {

	public static void main(String[] args) {
		Object x[]=new Object[5];
		x[0]=100;
		x[1]="Madhu";
		x[2]='M';
		x[3]=123.456;
		x[4]=true;
		
		for (Object each : x) {
			System.out.println(each);
			
		}
		

	}

}
