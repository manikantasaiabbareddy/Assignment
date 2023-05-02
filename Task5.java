package Assignment;
import java.util.*;

public class Task5 {

	public static void main(String[] args) {
		method1();

	}
	public static void method1() {
	       
        String str= "consultadd", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println(str); 
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
      }
      System.out.println("Reversed word: "+ nstr);
    }
	
	public static void method2(){  
		String str="Consultadd PVT";
	    String words[]=str.split("\\s");  
	    String reverseWord="";  
	    for(String w:words){  
	        StringBuilder sb=new StringBuilder(w);  
	        sb.reverse();  
	        reverseWord+=sb.toString()+" ";  
	    }  
	    System.out.println(reverseWord.trim());  
	} 
	
	static void method3()
    {
		char str1[] = ("gram").toCharArray();
        char str2[] = ("arm").toCharArray();
       
        int n1 = str1.length;
        int n2 = str2.length;
 
        if (n1 != n2)
        	System.out.println("The two strings are not"
                    + " anagram of each other");
 
        
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        
        for (int i = 0; i < n1; i++)
            if (str1[i] != str2[i])
            	System.out.println("The two strings are not"
                        + " anagram of each other");
 
        System.out.println("The two strings are"
                + " anagram of each other");
    }
	
	public static void method4()
    {
        int res = 0;
        String s= "consultadd";
        char c = 'd';
 
        for (int i=0; i<s.length(); i++)
        {
            
            if (s.charAt(i) == c)
            res++;
        }
        System.out.println(res);
    }
	public static void method5() {
	    String line = "Consultadd";
	    int vowels = 0, consonants = 0;

	    line = line.toLowerCase();
	    for (int i = 0; i < line.length(); ++i) {
	      char ch = line.charAt(i);

	     
	      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	        ++vowels;
	      }

	     
	      else if ((ch >= 'a' && ch <= 'z')) {
	        ++consonants;
	      }
	      
	     
	    }

	    System.out.println("Vowels: " + vowels);
	    System.out.println("Consonants: " + consonants);
	}
	
	public static void method6() {
	    
	    String txt = "This is consultadd Training";
	    String str1 = "consultadd";
	   

	    boolean result = txt.contains(str1);
	    if(result) {
	      System.out.println(str1 + " is present in the string.");
	    }
	    else {
	      System.out.println(str1 + " is not present in the string.");
	    }
	}

	    static void method8()
	    {
	    	String expr = "([{}])";
	       
	        Deque<Character> stack
	            = new ArrayDeque<Character>();
	  
	       
	        for (int i = 0; i < expr.length(); i++) 
	        {
	            char x = expr.charAt(i);
	  
	            if (x == '(' || x == '[' || x == '{') 
	            {
	               
	                stack.push(x);
	                continue;
	            }
	  
	           
	            if (stack.isEmpty())
	            	System.out.println("Not Balanced ");
	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                	System.out.println("Not Balanced ");
	                break;
	  
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                	System.out.println("Not Balanced ");
	                break;
	  
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                	System.out.println("Not Balanced ");
	                break;
	            }
	        }
	  
	        
	        System.out.println("Balanced ");
	    }
 

}
