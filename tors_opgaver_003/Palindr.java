//still not working 

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
        System.out.println(input1);




        //if (str.equals(input1)){}
       

	}
}