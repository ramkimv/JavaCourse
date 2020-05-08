package JavaBasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) {
		
		System.out.println("Enter text: ");
		
		BufferedReader reader =  
                 new BufferedReader(new InputStreamReader(System.in)); 
		
		String name = null;
		try {
			name = reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

		  
        if (isPalindrome(name)) 
            System.out.print("Yes"); 
        else
            System.out.print("No"); 
        
	}
		static boolean isPalindrome(String str) 
	    { 
	  
	        // Pointers pointing to the beginning 
	        // and the end of the string 
	        int i = 0, j = str.length() - 1; 
	  
	        // While there are characters toc compare 
	        while (i < j) { 
	  
	            // If there is a mismatch 
	            if (str.charAt(i) != str.charAt(j)) 
	                return false; 
	  
	            // Increment first pointer and 
	            // decrement the other 
	            i++; 
	            j--; 
	        } 
	  
	        // Given string is a palindrome 
	        return true; 
	    } 
	    
	} 
	
