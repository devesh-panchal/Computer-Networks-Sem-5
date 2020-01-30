import java.io.*;
import java.net.*;

class Bitstuffserver
{
	public static void main(String[] args) 
	{
		ServerSocket skt=new ServerSocket(1234);

		Socket socket = skt.accept();

		DataInputStream dis = new DataInputStream(socket.getInputStream());
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());


		String s = dis.readUTF();
		int count=0;

		System.out.println("stuffed data from client :",+s);

		System.out.println("unstuffed data is:");

		for (int i =8 ; i<s.length()-8;i++)
		{
			char ch = s.chaAt(i);
			if(ch=='1')
			{
				count++;
				System.out.println(ch);

				if(ch==5)
				{
					i++;
					count=0;

				}
				else
				{
					System.out.println(ch);

					count=0;


				}
			}
			System.out.println();

		} 
		
	}
}
