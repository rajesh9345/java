package Collection;
import java.util.*;
public class Check_f_l {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("enter one sentance");
  String s1=s.nextLine();
  int i1=s1.length();
  
	  if(s1.charAt(0)==s1.charAt(i1-1)) {
		  System.out.print("valid");
	  }
	  else {
		  System.out.println("invalid");
	  }
  }
	

}
