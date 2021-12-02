package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class MobileException extends Exception
{
	String meg;

	public MobileException(String meg) {
		
		this.meg = meg;
	}

	@Override
	public String toString() {
		return meg;
	}
	
}
public class Mobile {

	static void write()throws IOException
	{
		//BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\izmo\\Reader1.txt"));
		Scanner s=new Scanner(System.in);
		System.out.println("enter how many Mobile number you want");
		int n=s.nextInt();
		s.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("enter number");
			String mobi=s.nextLine()+"\n";
		        bw.write(mobi);
		}
		bw.close();
		BufferedReader br=new BufferedReader(new FileReader("C:\\izmo\\Reader1.txt"));
		
		String mobi=br.readLine();
		try {
		while(mobi!=null)
		{
			
			if(mobi.length()==10) {
				System.out.println("  this is valid number ");
			}
			else
			{
				throw new MobileException(" this is invalid number");
			}
			mobi=br.readLine();
			}
		}
		catch(MobileException e)
		{
			System.out.println(e);
		}
		br.close();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     write();
	}

}
