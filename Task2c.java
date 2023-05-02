package Assignment;
import java.util.*;
public class Task2c {
	
	
			public static void main(String args[])
			{
				int units = 250;
				double a=calculateBill(units);
				a=a+(a*.20);

				System.out.println(
					a);
			}
			public  static double calculateBill(int units)
			{

				
				if (units <= 60) {
					return units * 0.30;
				}
				else if (units>60 &&units <= 150) {
					return (60 * 0.30)
						+ (units - 60)
							* 0.75;
				}
				else if (units>150 &&units <= 270) {
					return (60 * 0.30)
						+ (90 * .75)
						+ (units - 150)
							* 1.10;
				}
				else  {
					return (units * 2.50);
						
				}
				
			}
		}


	


