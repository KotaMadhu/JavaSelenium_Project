package arrays.March;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Nexon");
		cars.add("Altoz");
		cars.add("Harrier");
		cars.add("Tiago");
		cars.add("Tigor");
		cars.add("Indica");
		cars.add("Safari");
		cars.add("EV Punch");
		
		System.out.println(cars.size());
		System.out.println("=====================");
		System.out.println(cars.get(3));
		System.out.println("=====================");
		for(int i=3;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
			System.out.println("=====================");
			
		for(int i=0;i<cars.size();i++) {
			System.out.println(cars.get(i));
		}
				}

}
