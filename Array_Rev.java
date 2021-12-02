package Collection;
import java.util.*;
public class Array_Rev {

	public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  System.out.println("enter one string");
  String n=s.nextLine();
  String n2="";
  int f=0;
  for(int i=0;i<n.length();i++) {
	  if(i%2!=0) {
		  if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='o'||n.charAt(i)=='i'||n.charAt(i)=='u') {
			  //i++;
			  continue;
		  }
		  else{
			  n2+=n.charAt(i);
		  }
	  }
	  else{
		  n2+=n.charAt(i);
	  }
  }

  System.out.println(n2);
	}
}
