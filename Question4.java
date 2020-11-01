package day4;

public class Question4 {

	public static void main(String[] args) {
		
		int n1,n2,n3;
		n1=10;
		n2=20;
		
		n3=n1; //10
		n1=n2; //20
		n2=n3; //10
		
		n1=n1+n2; //30
		n2=n2-n1; //10
		n1=n1-n2; //20
		

	}

}
