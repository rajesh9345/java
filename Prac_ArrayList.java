package Collection;
import java.util.*;
import java.util.ArrayList;
public class Prac_ArrayList {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter first string");
     String s1=s.nextLine();
     int ss1=s1.length();
     StringBuffer s3=new StringBuffer();
     System.out.println("enter second string");
     String s2=s.nextLine();
     String ou="";
     for(int i=0;i<s1.length();i++)
     {
    	 if(i%2==0) {
    		 s3.append(s2);
    		}
    	 else {
    		 s3.append(s1.charAt(i));
     }
    }
    if(ss1-2) {
    	
    }
     System.out.print(s3);    
}
}
