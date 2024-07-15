import java.util.Scanner;
class BuzzNumberMethod

{
	public static void isBuzz(int num) 
	{
		int ld=num%10;
		if((ld==7)||(num%7==0))
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
		isBuzz(num);

	}
}
