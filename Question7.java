package day4;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your cent");
		int cent=scan.nextInt();
		int a=100-cent;
	    int b=a/25;
	    int c=a%25;
	    int d=c/10;
	    int e=c%10;
	    int f=e/5;
	    int g=e%5;
	    System.out.println(b+" quarter "+d+" dime "+f+" nickel");
	    
	    
		

	}

}
