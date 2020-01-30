import java.util.*;

class Main
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);


		int s=0;
		int r=0;
		int i=0;


		while(i<=4)
		{
			System.out.println("SENDER ");
			System.out.println("sending frame "+s);
			System.out.println(" ");

			System.out.println("RECEIVER" );
			
			if(s!=r)
			{
				System.out.println("discard frame");
				System.out.println("Send Acknowledgement "+r);

			}
			else
			{
				System.out.println("1:error or lost 2:Timing 3:Frame aceept");
				if(sc.nextInt()==3)
				{
					//r=(r+1)%2;
					System.out.println("Acknowledgement send "+r);

				}

			}


			System.out.println("SENDER");
			System.out.println("1:recevied ACK 2:Timeout");
			if(sc.nextInt()==1)
			{
				s++;
				r++;
			}
			i++;
		}
	}
}