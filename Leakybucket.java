import java.util.*;
import java.io.*;

class Main
{
	public static void main(String[] args)
	{
		int noofqueries,storage,bucketsize,inputsize,outputsize,sizeleft;

		storage=0;

		noofqueries=4;

		bucketsize=10;

		inputsize=4;

		outputsize=1;

		for(int i=0;i<noofqueries;i++)
		{
			sizeleft=bucketsize-storage;

			if(inputsize<=(sizeleft))
			{
				storage=storage+inputsize;

				System.out.println("buffer size "+storage+" out of bucket size "+bucketsize);

			}
			else
			{
				System.out.println("packet loss "+(inputsize-(sizeleft)));
				storage=bucketsize;


				System.out.println("buffer size "+storage+" out of bucket size "+bucketsize);




			}

            System.out.println("buffer size "+storage);
			storage=storage-outputsize;
			System.out.println("buffer size "+storage);
        }   
}
}
