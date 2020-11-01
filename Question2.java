package day4;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your name");
		String name=scan.next();
		
		System.out.println("enter your birth year");
		int year=scan.nextInt();
		
		int currentyear=2020;
		
		int age=currentyear-year;
		

		
		System.out.println("Hello "+name+"!"+"Based on your input,age is"+age);

	}

}
