import java.util.*;

class Checksum
{
		int[] add(int[] a,int[] b)
		{
			int c=0;
			int x[]=new int[a.length];
			for(int i=0;i<a.length;i++)
			{
				x[i]=a[i]+b[i]+c;

				if(x[i]>1)
				{
					c=1;
				}
				else
				{
					c=0;
				}

				x[i]=x[i]%2;

			}
			return x;
		}

		int[] complement(int[] c)
		{
			int x[]=new int[c.length];

			for(int i=0;i<c.length;i++)
			{
				x[i]=(c[i]+1)%2;
			}
			return x;

		}

		void cal()
		{   int i=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter no. of bits");
			int n= sc.nextInt();

			int a[]=new int[n];
			int b[]=new int[n];
			int c[]=new int[n];
			int d[]=new int[n];

			System.out.println("AT SENDER");


			System.out.println("enter frame 1");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();

			}
			System.out.println("enter the frame 2");

			for (i=0;i<n;i++)
			{
				b[i]=sc.nextInt();

			}
			c=add(a,b);
			d=complement(c);

			System.out.println("CHECKSUM:");
			for(int k: d)
			{
				System.out.print(k);
			}

            	System.out.println("\n  \n");
			System.out.println("AT RECEIVER");

			System.out.println("enter the frame 1 received");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();

			}
			System.out.println("enter the frame 2 received");

			for(i=0;i<n;i++)
			{
				b[i]=sc.nextInt();				
			}

			System.out.println("enter the checksum received");

			for(i=0;i<n;i++)
			{
				c[i]=sc.nextInt();
			}

			d=add(a,b);
			a=add(c,d);
			b=complement(a);

			int flag=0;

			for(int j: b)
			{
				if(j==1)
				{
					flag=1;
					break;
				}
			}

			if(flag==0)
			{
				System.out.println("FRAME ACCEPTED");
			}
			else
			{
				System.out.println("FRAME REJECTED AS ERROR DETECTED");
			}
		}

			public static void main(String[] args) 
			{
				Checksum c = new Checksum();
				c.cal();

			}
		}
	

