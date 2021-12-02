package Date;
import java.text.*;
import java.util.*;
import java.util.Date;
import java.util.Calendar;
public class First {

	public static void main(String[] args) throws ParseException  {
    Scanner s=new Scanner(System.in);
    
//    System.out.println("enter date");
//    String date=s.nextLine();
//    System.out.println("enter date format");
//    String da1=s.nextLine();
//    SimpleDateFormat sbf=new SimpleDateFormat(da1);
//    
//    Date d1=sbf.parse(date);
//    String d2=new SimpleDateFormat("EEEEE").format(d1);
//   System.out.println(d2);
//   System.out.println("enter time");
//   String time=s.nextLine();
//   int time1=Integer.parseInt(time);
//   if(time>=0)
//   Date d1=

   
	//Date d=new Date();
//	System.out.println(d);
	//System.out.println(d.getDate());
//	System.out.println(d.getDay());
	//System.out.println(d.getHours());
//	System.out.println(d.getMinutes());
//	System.out.println(d.getSeconds());
//		
    Calendar c=Calendar.getInstance();
    //System.out.println(c.get(Calendar.DATE));
    System.out.println(c.getTime());
    System.out.println(c.get(Calendar.HOUR));
    //System.out.println(c.get(Calendar.MINUTE));
    //System.out.println(c.get(Calendar.MONTH));
    //System.out.println(c.get(Calendar.YEAR));
//    System.out.println(c.get(Calendar.DAY_OF_WEEK));
//    System.out.println(java.time.LocalTime.now());  
//    System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());
	}

}
