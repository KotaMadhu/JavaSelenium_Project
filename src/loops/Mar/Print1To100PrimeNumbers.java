package loops.Mar;

public class Print1To100PrimeNumbers {

	public static void main(String[] args) {
		int n=0, i=0;
		for(i=1;i<=100;i++) {
			int count =0;
			for(n=i;n>=1;n--) {
				if(i%n==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
			
		}
		System.out.println("Prime Numbers between 1 to 100");

	}

}
