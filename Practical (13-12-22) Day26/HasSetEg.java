package Pracital;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HasSetEg {
  public static void main(String[] args) {
   Set<String> s4=new HashSet<String> ();// certain 
   s4.add("AC");
   s4.add("Pencil");	

   s4.add("Mouse");

   s4.add(null);

   s4.add("Phone");

   s4.add("AC");
   s4.add("Bottle");
   Iterator<String> itr = s4.iterator();
   while(itr.hasNext()) {
	   System.out.println(itr.next());
   }
  }
}
