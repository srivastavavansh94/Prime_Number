import java.util.Scanner;
class PrimeNo
{
	public static void main(String[]args)
	{
		int count=0 , range , num=2;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the reange ;");
		range=scan.nextInt();
		for(int i=0;i<=range;i++)
		{
			for(int j=1;j<=num;j++)
			{
				if(num%j!=0)
					count++;
			}
			if(count==num)
				System.out.println(num+"numbers are");
			    num++;
		        }
	}
}