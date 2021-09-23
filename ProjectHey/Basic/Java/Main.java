/*
 * Estares Jericho Y "POGI"
 */

import java.util.*;
public class Main {
	public static void main(String[]mainclass) {
		String choose, choose2;
		Scanner input = new Scanner(System.in);
		System.out.print("Start? : [Y]/[N]\nAnswer: ");
		choose = input.nextLine();
		
		if(choose.equals("Y")||choose.equals("y")) {
			console programmain = new console();
			programmain.setItemName(choose);
			
			
		}else if(choose.equals("N")||choose.equals("n")) {
			System.out.print("Ok");
		}else {
			System.out.println("Choose Y/N only.");
					
		}
		
	}

}
/*
 * Program that call other project in one.
 */