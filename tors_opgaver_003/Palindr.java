import java.lang.*;
import java.io.*;
import java.util.*;


class Palindr
{
	public static void main(String[] args) 
	{
		printIfPalindrome("Den laks skal ned");
	}

	

 	public static void printIfPalindrome(String str)
	{

		//set the string to lowercase 
		str = str.toLowerCase();

        StringBuilder input1 = new StringBuilder();
  
        // append a string into StringBuilder input1
        input1.append(str);
  
        // reverse StringBuilder input1
        input1.reverse();

        // print reversed String
        
        String input2 = input1.toString();

        boolean sameWord = str.equals(input2);

        if(sameWord == true)
        {
        	System.out.println(input1);

        }
      	


        
       

	}
}