import java.util.*;
public class console2 {
	public static void setTotalCost(int quantity,double itemprice) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Quantity and prince separated by a space\nPrice: ");
		itemprice = s.nextDouble();
		System.out.println("Quantity: ");
		quantity = s.nextInt();
		
		double total= (itemprice*quantity);
		
		System.out.print("You are purchasing "+quantity+ " at " +itemprice+" each");
		
		System.out.print("Amount: "+total);
		
	}
}
