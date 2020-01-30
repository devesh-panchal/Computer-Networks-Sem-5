import java.util.*;

class Main
{
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		System.out.println("enter the binary message");

		String data =sc.nextLine();


		String res = new String();
		String out = new String();

		int count =0;

		for (int i=0;i<data.length();i++)
		{
			if(data.charAt(i)!='0' && data.charAt(i)!='1')
			{
				System.out.println("enter the proper binary message");

			}	
		
		}


		for(int i=0;i<data.length();i++)
		{
			if(data.charAt(i)=='1')
			{
				count++;
				res=res+data.charAt(i);

			}
			else
			{
				count=0;
				res=res+data.charAt(i);


			}

			if(count ==5)
			{
				res=res+'0';
				count=0;

			}
		}



		String trans="01111110"+res+"01111110";


		System.out.println("message is to transferred (stuff data) = "+trans);

		System.out.println("SENDING...");

		count=0;


		for(int i=0;i<res.length();i++)
		{
			if(res.charAt(i)=='1')
			{
				count++;
				out=out+res.charAt(i);
			}
			else
			{
				out=out+res.charAt(i);
				count=0;
			}

			if(count==5)
			{
				i++;
				count=0;

			}
		}

		System.out.println("message succesfully received ");

		System.out.println("data received (unstuff data) =  "+out);
		



	}
}