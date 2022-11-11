package Practical;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
 public static void main(String[] args) {
	// three way to represent the pattern & matcher
	
	 // 1st way
	 Pattern p = Pattern.compile(".a");// single dot represent single character
	 //compile regular expression into  pattern
	 Matcher m = p.matcher("ma");  // .a dot represent single char
	 boolean b=m.matches();
	 System.out.println(b);
	 
	 //2nd way 
	 boolean bb =Pattern.compile("..m").matcher("am").matches();
	 System.out.println(bb);
	 
	 boolean bbb=Pattern.matches(".a", "sa");
	 System.out.println(bbb);
	 
	 
	 // character class=====
	 
	 // [abc]=a,b,c, [^abc]=any char except abc, [a-zA-Z]=either upper or lower case and both
	 boolean b5=Pattern.matches("[a-zA-Z]", "A");
	 boolean b6=Pattern.matches("[pqr]", "pqr");

	 boolean b7=Pattern.matches("[^abc]", "r");
	 System.out.println(b5+" "+b6+" "+b7);
	 
	 // Quantifiers 
	 // x? - x occur once not at all   x+  -- x occur once or more than one 
	 //x* -- x occur zero or more time  x(n) -- x occur time x {7} only char 
	 // x{n,} -- x occur o or more time x {7,} only 7 char or more 
	 boolean b8= Pattern.matches("[a-zA-Z0-9]{1,}","[Anudip123ppp]");
	 System.out.println(b7);
	 boolean b9=Pattern.matches("[a-z0-9@.]{5,}", "abhisekmaity12@gmail.com");
	 System.out.println(b9);
	 
	 
	 
	 

}
}
