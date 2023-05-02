package Assignment;

import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		String a ="Manikanta Sai";
		System.out.println(a);
		Scanner task2=new Scanner(System.in);
		System.out.println("Enter the missing name ");
		System.out.print(a+" "+task2.next());
		System.out.println("");
		Scanner num = new Scanner(System.in);
		System.out.println("Give the two numbers for addition");
		System.out.println("give the first num");
		int num1=num.nextInt();
		System.out.print("give the second num");
		int num2=num.nextInt();
		System.out.println("addition of two numbers are "+add(num1,num2));
		
		System.out.print("give the radius of the circle");
		System.out.println("area of the Circle"+area(num.nextInt()));
		
		Scanner n=new Scanner(System.in);
		System.out.println("enter the value of x ");
		int x=n.nextInt();
		System.out.println("enter the value of y ");
		int y=n.nextInt();
		System.out.println("x="+x+" y="+y);
		int swap;
		swap=x;x=y;y=swap;
		System.out.println("x="+x+" y="+y);
		
		System.out.println("---------------");
		System.out.println("x="+x+" y="+y);
		x=x+y;y=x-y;x=x-y;
		System.out.println("x="+x+" y="+y);

	}
	public static double add(double n1,double n2) {
		return n1+n2;
	}
	public static double area(double r) {
		return 3.14*r*r;
	}
	

}
