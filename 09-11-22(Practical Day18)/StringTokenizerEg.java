package Practical;

import java.util.StringTokenizer;

// Single way to break a string, package: StringTokenizer
public class StringTokenizerEg {
   public static void show() {
	   StringTokenizer st1 = new StringTokenizer("Anudip foundation skill and career devlopment center ");
   while(st1.hasMoreTokens()) {
	   System.out.println(st1.nextToken(" "));
	   StringTokenizer st2 = new StringTokenizer("Hello every one i, am Abhisek Maity");
	      while(st1.hasMoreTokens()) {
	    	  System.out.println();
		   System.out.println(st2.nextToken(",")); 
      }
	      }
   }
   public static void main(String[] args) {
	   show();
	   
	
      }
   }

