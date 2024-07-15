import java.util.Scanner;
class SpyNumberUsingMethods
{
	public static void isSpy(int num) 
	{
		int sum=0;
		int pro=1;
		while(num!=0)
		{
			int ld=num%10;
			sum=sum+ld;
			pro=pro*ld;
			num=num/10;
		}
		if(sum==pro)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		isSpy(num);	
	}
}
