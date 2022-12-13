package Pracital;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEg {
  public static void main(String[] args) {
	TreeSet<String> set = new TreeSet<String> (); // creating tree set
	set.add("A");
	set.add("N");
	set.add("D");
	set.add("P");
	set.add("Q");
	set.add("S");
	set.add("T");
	set.add("J");
	set.add("F");
	set.add("G");
	set.add("V");
	set.add("C");
	set.add("R");
	
	System.out.println("Original "+set);  // it will come by defaut sorted way
	// traversing elements through iterator in descending 
	Iterator itr = set.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("Lowest value :"+set.pollFirst());
	System.out.println("Updated set After PolFirst: "+set);
	System.out.println("Highest value "+set.pollLast());
	
	System.out.println("Headset: "+set.headSet("D"));  // Before D value will be printed
	System.out.println("SubSet :"+set.subSet("C", "N"));  // 
	System.out.println("tellSet :"+set.tailSet("O"));
}
}
