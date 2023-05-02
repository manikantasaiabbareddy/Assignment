package Assignment;
import java.util.Scanner;
public class Task2b {

	  public static void main(String[] args) {
	    char operator;
	    int a;
	    Double n1, n2, r;
	    Scanner input = new Scanner(System.in);
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = input.next().charAt(0);
	    System.out.println("Enter first number");
	    n1 = input.nextDouble();
	    System.out.println("Enter second number");
	    n2 = input.nextDouble();
	    switch (operator) {
	      case '+':
	        r = n1 + n2;
	        System.out.println(n1 + " + " + n2 + " = " + r);
	        break;
	      case '-':
	        r = n1 - n2;
	        System.out.println(n1 + " - " + n2 + " = " + r);
	        break;
	      case '*':
	        r = n1 * n2;
	        System.out.println(n1 + " * " + n2 + " = " + r);
	        break;
	      case '/':
	        r = n1 / n2;
	        System.out.println(n1 + " / " + n2 + " = " + r);
	        break;
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
	    
	    System.out.println("Enter the Number");
	    a=input.nextInt();
	    while(a>0) {
			  System.out.println("Good Going");
			  System.out.println("Enter the Number");
			  a=input.nextInt();
			  continue;
		  }
		  System.out.println("Its Over");

	    input.close();
	    
	    
	    
	  }  
	  }
	
