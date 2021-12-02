package Collection;
import java.util.*;
public class Fetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner s=new Scanner(System.in);
  System.out.println("enter array length");
  int s1=s.nextInt();
  int arr[]=new int[s1];
  String s2="";
 for(int i=0;i<s1;i++) {
	 int a=s.nextInt();
	 String b=a+"";
	 for(int j=0;j<b.length();j++) {
		 s2=b.charAt(j)+s2;
	 }
	 arr[i]=Integer.parseInt(s2);
	 s2="";
 }
 Arrays.sort(arr);
 for(int i=0;i<s1;i++) {
	 

  System.out.println(arr[i]+" ");
	}
	 }

}
