package Assignment;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		
		SumOfEven() ;
		PrintStar();
		
		int  firstTerm = 0, secondTerm = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the  number");
	    int n1 = input.nextInt();
	    System.out.println("Fibonacci Series till " + n1 + " terms:");

	    for (int i = 1; i <= n1; i++) {
	      System.out.print(firstTerm + ", ");

	      
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }

	}
	public static void Factorial() {

        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
           
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
	
	
		  public static void Palindorme() {

		    String str = "Radar", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
		
		  public static void PrimeOrNot() {

			    int num = 29;
			    boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) {
			      
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			  }
		  public static void SumOfEven() {
			    Scanner in= new Scanner(System.in);
			    
				System.out.print("Enter the value of n: ");
				int n = in.nextInt();
				
				int sum=0, num = 1, count=0;
				
				while(count<n){
				    
				    sum+=(2*(count+1));
				    count++;
				}
				
				System.out.println("Sum: "+sum);
			}
		  public static void largestAndSmallest()
		    {
		        int small=0;
		        int large=0; 
		        int num;

		        System.out.println("enter the number");

		        Scanner input=new Scanner(System.in);

		        int n=input.nextInt();

		        for(int i=0;i<n;i++)
		        {
		          num=input.nextInt();
		          if(num>large)
		          {
		           large=num;
		          }
		          System.out.println("the largest is:"+large);
		          
		          
		          if(i==0&&num>0)
		              small=num;
		          if(num<small)
		             small=num;
		          System.out.println(small);
		        }


		    }
		  public static void printStars() 
		    { 
		        int n=5,i, j;  
		        for (i = 0; i < n; i++) {  

		        	for (j = 2 * (n - i); j >= 0; j--) { 

		        	System.out.print(" ");

		        	}

		        	for (j = 0; j <= i; j++) {

		        	System.out.print("* "); 

		        	}

		        	System.out.println();

		        	}

		        	}
		  
		  public static void PrintStar() {
			  int k1=5;

			  System.out.println("Number of rows: ");

			  int rows = k1;

			  int i;

			  
			  for (i = 1; i <= rows; i++) {

			  for (int j = rows; j > i; j--) {

			  System.out.print(" "); 

			  }

			  System.out.print("*"); 

			  for (int k = 1; k < 2 * (i - 1); k++) { 

			  System.out.print(" "); 

			  }

			  if (i == 1) {

			  System.out.println(""); 

			  } else {

			  System.out.println("*");

			  }

			  }

			 

			  for (i = rows - 1; i >= 1; i--) {

			  for (int j = rows; j > i; j--) {

			  System.out.print(" "); 

			  }

			  System.out.print("*");

			  for (int k = 1; k < 2 * (i - 1); k++) { 

			  System.out.print(" ");

			  }

			  if (i == 1)

			  System.out.println(""); 

			  else

			  System.out.println("*"); 

			  }

			  }
		    }

