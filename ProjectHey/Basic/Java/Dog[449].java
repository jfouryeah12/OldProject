import java.util.*;
public class Dog {

	 String dogname;
	  int age;
	  String[]dogger= {"Enter your dog's breed : ","Enter your dog's size : ","Enter your dog's color : ",
	 "Enter your dog's age : "};
      String[]ans= {"","","",""};
      String[] x = {"Your dog's breed is : ","Your dog's size is : ","Your dog's color is : ","Your dog's age is : "};
      Scanner input = new Scanner(System.in);
	 public static void main(String[] args) {
		
		Dog dog = new Dog();
		System.out.println("--Your Dog's Information--");
		for(int count=0;count<3;count++) {
			System.out.print(dog.dogger[count]);
			dog.ans[count] = dog.input.next();
		}
		System.out.print(dog.dogger[3]);
		 dog.age = dog.input.nextInt();
		 System.out.println(" ");
		for(int count=0;count<3;count++) {
			System.out.println(dog.x[count] + dog.ans[count]);
		}
		System.out.println(dog.x[3]+dog.age);

	}

}
