package day4;

public class Question5 {

	public static void main(String[] args) {
		
		int inputSecond=3695;
		int hour=inputSecond/3600;
		int minute=(inputSecond%3600)/60;
		int second=inputSecond%60;
		
System.out.println(hour+" hours "+minute+" minutes "+second+" seconds ");

	}

}
