import java.util.Scanner;
class ArmStrongNumberUsingMethods
{
	public static void isArmstrong(int num) 
	{
		int temp=num;
		int count=0;
		while(temp!=0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		int sum=0;
		while(temp!=0)
		{
			int ld=temp%10;
			int pro=1;
			for(int i=1;i<=count;i++)
			{
				pro=pro*ld;
			}
			sum=sum+pro;
			temp=temp/10;
		}
		if(sum==num)
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
		isArmstrong(num);
	}
}
