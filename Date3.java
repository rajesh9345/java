package Date;
import java.util.*;
public class Third {

	public static void main(String[] args) {
   Scanner s=new Scanner(System.in);
   System.out.println("enter number");
   int n=s.nextInt();
   int sum=0,sum1=0,sum2=0;
  // int j=0;
   for(int i=0;i<=n;i++)
   {
	   int j=0;
	  j=1+(2*i);
	   if(j<=n)
	   {
	   if(j%4==1 && j>1)
	   {
	   System.out.print("-"+j);
	   sum1+=j;
	   }
	    else
	    {
	    System.out.print("+"+j);
	   sum2+=j;
	    }
	   }
	    }
   sum=sum2-sum1;
   System.out.print("="+sum);
   }
   }
	



