package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWrite {
     
	static void write() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\izmo\\Reader.txt"));
		do {
		System.out.println("enter data");
		String data=br.readLine();
		if(data.equalsIgnoreCase("no"))
		{
			break;
		}else {
			bw.write(data+ " \n");
		}
		}while(true);
		br.close();
		bw.close();
	}
	static void read() throws IOException {
		BufferedReader bb=new BufferedReader(new FileReader("C:\\izmo\\Reader.txt"));
		int count=0,count1=0;
		//System.out.println("enter content of file");
		String s=bb.readLine();
		while(s!=null )
		{
			System.out.println(s);
			for(int i=0;i<s.length();i++)
			{
			if(s.charAt(i)==' ')
			{
				count1++;
			}
			}
			System.out.println("no of words="+count1);
			count1=0;
			count++;
			s=bb.readLine();
		
		}
		System.out.println("no of lines="+count);
		bb.close();
	}
	public static void main(String[] args) throws IOException {
   write();
   read();
	}

}
