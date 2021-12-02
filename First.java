package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class First {

	public static void main(String[] args) throws IOException {
   FileInputStream fin=null;
   //try {
	   fin=new FileInputStream("C:\\izmo\\File.txt");
	   int a=0;
	   while((a=fin.read())!=-1)
	   {
		   System.out.print((char)a);
	   }
   //}
  // catch(Exception e) {
	//   e.printStackTrace();
  // }
   //finally {
	  // try {
		   if(fin!=null) {
			   fin.close();
		   }
	   //}
//	   catch(Exception ae) {
//		   ae.printStackTrace();
//	   }
   }
	}


