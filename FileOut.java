package File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class FileOut {

	public static void main(String[] args) throws IOException {
  FileOutputStream fos=new FileOutputStream("C:\\izmo\\Out.txt");
  Scanner s=new Scanner(System.in);
  System.out.println("enter number of lines");
  int n=s.nextInt();
  //String s1=Integer.toString(n);
  System.out.println("enter string data");
  //byte b1[];
  for(byte i=0;i<=n;i++)
  {
	  String ss=s.nextLine()+"\n";
	  //b1[i]=s.nextLine();
	 byte[] b1=ss.getBytes();
	  fos.write(b1);
  }
  System.out.println("file created");
  FileInputStream fis=new FileInputStream("C:\\izmo\\Out.txt");
  int a=0;
  while((a=fis.read())!=-1) {
	  System.out.print((char)a);
	 
  }
  if(fis!=null) {
	  fis.close();
  }
	}
}
