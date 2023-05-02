package Assignment;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=n.nextInt();
		System.out.println("Given Number is "+a);
		System.out.println("Entered number is "+ check(a));
		
		
		System.out.println("Enter the charcter ");
		char b=n.next().charAt(0);
		Char(b);
		
		System.out.println("Enter the year ");
		int year=n.nextInt();
		leapyear(year);
		
		grade(90);
	}
	public static String check(int a) {
		if(a<0)
			return "Negative";
		return "Positive";
	}
	 public static void Char(char c) {
	        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
	            System.out.println(c + " is an alphabet.");
	        else
	            System.out.println(c + " is not an alphabet.");
	    }
	 public static void remqo(int a,int b) {
		 System.out.println("The remainder is "+ a/b);
		 System.out.println("The remainder is "+ a%b);
	 }
	 public static void leapyear(int year) {
		 String result;

		    
		    result = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "is a leap year" : "is not a leap year";

		    System.out.println(year + " " + result + ".");
	 }
	 public static void grade(int p) {
		 if (p>90)
			 System.out.println("The assigned grade is A");
		 else if(p>75 && p <=90) {
			 System.out.println("The assigned grade is B");
		 }
		 else 
		 	System.out.println("The assigned grade is c");
	 }

}
