package arrays.March;

public class ObjectArrayUsingTwoDimensional {

	public static void main(String[] args) {
				
		Object str[][]=new Object[5][2];
		str[0][0]="user1";
		str[0][1]=96668;
		str[1][0]="user2";
		str[1][1]=80910;
		str[2][0]="user3";
		str[2][1]="970cds";
		str[3][0]="user4";
		str[3][1]=30381;
		str[4][0]="user5";
		str[4][1]="*****";
		System.out.println("Enter UserName and Password");
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
			System.out.print(str[i][j]+"\t");
			}
			System.out.println();
		}
	
		
	}

}

