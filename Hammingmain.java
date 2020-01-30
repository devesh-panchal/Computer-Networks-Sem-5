import java.util.*;

class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i=0,j=0,k=0,count=0,sum=0;
		int x=0;
		int m=0;
		

		System.out.println("enter the no. of bits");
		int n=sc.nextInt();


		while(n>(Math.pow(2,i)))
		{
			i++;
		}
		
		
		x=i+1;
		m=x+n;

		int d[]=new int[n+1];
		int h[]=new int[m+1];

        System.out.println("enter the bits");
		for(i=1;i<=n;i++)
		{
			d[i]=sc.nextInt();

		}

		for(i=1,j=0,k=1;k<=m;k++)
		{
			if(Math.pow(2,j)==k)
			{
				h[k]=0;
				j++;

			}
			else
			{
				h[k]=d[i];
				i++;
			}

		}



		for(j=0,k=1;k<=m;k++)
		{
			if(Math.pow(2,j)==k)
			{
				h[k]=0;
				count=0;
				sum=0;


				for(int c=k;c<=m;c++)
				{
					if(count<k)
					{
						sum+=h[c];
						count++;
					}
					else
					{	
						c+=(k-1);
						count=0;

					}

				}

				if(sum%2!=0)
				{
				h[k]=1;
				}
				else
				{	h[k]=0;}

				j++;

			}
		}


		System.out.println("Transmitted code word is = ");
		for(i=1;i<=m;i++)
		{
			System.out.print(h[i]);
		}
	}
}