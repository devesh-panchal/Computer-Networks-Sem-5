import java.util.*;

public class Crcmain
{	
int[] divide(int[] divisor, int[] dividend)
    {
        int n=dividend.length;
        int remainder[] = new int[n];
        System.arraycopy(dividend, 0, remainder, 0,n);
        int start=0;
        int end=divisor.length-1;
        while(end<n)
        {
            if(remainder[start]!=0)
            {
                for(int i=start,j=0;i<=end;i++,j++)
                {
                    remainder[i]=divisor[j]^remainder[i];
                }                
            }
            start++;
            end++;
        }
        return remainder;
    }
    
	public void cal()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of divisor (key)");
		int n;
		n= sc.nextInt();
		int r = n-1;
		int divisor[] = new int[n];
		System.out.println("enter the divisor (key)");

		for (int i=0;i<n;i++)
		{
			divisor[i]=sc.nextInt();
		}


		int m;

		System.out.println("enter the no. of divident (dataword)");
		m= sc.nextInt();

		int divident[] = new int[m+r];

		System.out.println("enter the divident (dataword)");
		for (int i=0;i<m;i++)
		{
			divident[i]=sc.nextInt();

		}

		int rem[]=divide(divisor,divident);

		int i=r+m-1;
		while(i>=m)
		{
			divident[i]=rem[i];
			i--;

		}

		System.out.println("code word is ");

		for (int p:divident)
		{
			System.out.print(p);
		}
		System.out.println("");

		System.out.println("RECIEVER: enter the received code");
		int datarecv[]=new int[m+r];

		for(int k=0;k<m+r;k++)
		{
			datarecv[k]=sc.nextInt();

		}

		rem=divide(divisor,datarecv);
		
		System.out.println("Syndrome:");
		for (i=0;i<m+r;i++)
		{
			System.out.println(rem[i]);

		}

		System.out.println("");
		Boolean flag=true;

		for (int s:rem)
		{
			if(s==1)
			{
				System.out.println("message rejected , error in data recv , syndrome is not equal to 0");
				flag=false;
				break;

			}
		}
		if(flag)
		{
				System.out.println("message accepted , no error , syndrome is equal to 0");

		}

		}
		public static void main(String args[])
		{
			Crcmain c = new Crcmain();
			c.cal();
			 
		}



	}
