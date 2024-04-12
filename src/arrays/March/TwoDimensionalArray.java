package arrays.March;

public class TwoDimensionalArray {

	public static void main(String[] args) {
				
		String str[][]=new String[5][2];
		str[0][0]="user1";
		str[0][1]="pass1";
		str[1][0]="user2";
		str[1][1]="pass2";
		str[2][0]="user3";
		str[2][1]="pass3";
		str[3][0]="user4";
		str[3][1]="pass4";
		str[4][0]="user5";
		str[4][1]="pass5";
		
		System.out.println("Length of the row:"+str.length);
		
		System.out.println("Length of the column:"+str[0].length);
		
		System.out.println("Specific row & column data:"+str[2][0]);
		//Iterate all rows and columns
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
			System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}
	
		
	}

}
