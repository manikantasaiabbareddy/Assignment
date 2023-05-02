package Assignment;
import java.util.Scanner;
import java.util.Arrays;
public class Task4 {

	public static void main(String[] args) {
		

	}
	public static void method1() {
        int[] array = {1, 2, 3, 4, 5};

        for (int element: array) {
            System.out.print(element);
        }
    }
	
	public static void method2() {
        double[] numArray = { 45.3, 67.5, -45.6, 20.34, 33.0, 45.6 };
        double sum = 0.0;

        for (double num: numArray) {
           sum += num;
        }

        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
	
	public static void method3()
    {
		int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10,result=-1;
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            if (arr[i] == x)
                result=i;
        }
        if (result == -1)
            System.out.print(
                "Element is not present in array");
        else
            System.out.print("Element is present at index "
                             + result);
    }
	
	public void method4()
    {
		int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10,result=-1;
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            
            if (arr[m] == x)
                result= m;
 
            
            if (arr[m] < x)
                l = m + 1;
 
            
            else
                r = m - 1;
        }
 
        
        if (result == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + result);
    }
	
	
	public static void method5()
	   {
	      int m, n, c, d;
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Input number of rows of matrix");
	      m = in.nextInt();
	      System.out.println("Input number of columns of matrix");
	      n  = in.nextInt();
	 
	      int array1[][] = new int[m][n];
	      int array2[][] = new int[m][n];
	      int sum[][] = new int[m][n];
	 
	      System.out.println("Input elements of first matrix");
	 
	      for (  c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            array1[c][d] = in.nextInt();
	 
	      System.out.println("Input the elements of second matrix");
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	            array2[c][d] = in.nextInt();
	 
	      for ( c = 0 ; c < m ; c++ )
	         for ( d = 0 ; d < n ; d++ )
	             sum[c][d] = array1[c][d] + array2[c][d]; 
	 
	      System.out.println("Sum of the matrices:-");
	 
	      for ( c = 0 ; c < m ; c++ )
	      {
	         for ( d = 0 ; d < n ; d++ )
	            System.out.print(sum[c][d]+"\t");
	 
	         System.out.println();
	      }
	   }
	public static void findPair()
    {
		int[] nums = { 8, 7, 2, 5, 3, 1 };
        int target = 10;
      
        for (int i = 0; i < nums.length - 1; i++)
        {
            
            for (int j = i + 1; j < nums.length; j++)
            {
               
                if (nums[i] + nums[j] == target)
                {
                    System.out.printf("Pair found (%d, %d)", nums[i], nums[j]);
                    return;
                }
            }
        }
 
       
        System.out.println("Pair not found");
    }
	
	
	

	
	static void thirdLargest()
	{
		int arr[] = {12, 13, 1,
				10, 34, 16};
	int arr_size = arr.length;
		
		if (arr_size < 3)
		{
			System.out.printf(" Invalid Input ");
			return;
		}

		
		int first = arr[0];
		for (int i = 1;
				i < arr_size ; i++)
			if (arr[i] > first)
				first = arr[i];

		int second = Integer.MIN_VALUE;
		for (int i = 0;
				i < arr_size ; i++)
			if (arr[i] > second &&
				arr[i] < first)
				second = arr[i];

		int third = Integer.MIN_VALUE;
		for (int i = 0;
				i < arr_size ; i++)
			if (arr[i] > third &&
				arr[i] < second)
				third = arr[i];

		System.out.printf("The third Largest " +
					"element is %d\n", third);
	}

	

	

	
		public static void method10()
		{
			
			int a[] = { 30, 25, 40 };

			int b[] = { 30, 25, 40 };

		
			boolean result = Arrays.equals(a, b);

			
			if (result == true) {
				
				System.out.println("Two arrays are equal");
			}
			else {
				
				System.out.println("Two arrays are not equal");
			}
		
	}



	
	
	
	
}
