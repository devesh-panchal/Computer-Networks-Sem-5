import java.io.*;
import java.net.*;
import java.util.*;


class Bitstuffclient
{
	 public static void main(String[] args) 
	 {
	 	Socket socket = new Socket("localhost",6789);

	 	DataInputStream dis=new DataInputStream(socket.getInputStream());
	 	DataOutputStream dos = new DataOutputStream(socket.getOutputStream());


	 	Scanner sc = new Scanner(System.in);

	 	System.out.println("enter data");

	 	String data = sc.nextLine();

	 	int count=0;
	 	String s="";
	 	for(int i=0;i<data.length();i++)
	 	{
	 		char ch = data.charAt(i);
	 		if(ch=='1')
	 		{
	 			count++;

	 			if(count<5)
	 			{
	 				s=s+ch;
	 			}
	 			else
	 			{
	 				s=s+ch+'0';
	 				count=0;

	 			}


	 		}
	 		else
	 		{
	 			s=s+ch;
	 			count=0;

	 		}

	 	}

	 	s="01111110"+s+"0111111";

	 	System.out.println("data stuffed in client :"+s);
	 	System.out.println("sending to server for unstuffing");
	 	dos.writeUTF(s);
	 }

}

		
	