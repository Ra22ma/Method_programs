import java.util.Scanner;
class FibonacciUsingMethods
{
	public static void isFibonacci(int range) 
	{
		int a=0;
		int b=1;
		int sum=0;
		for(int i=1;i<=range;i++)
		{
			System.out.println(" "+sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		isFibonacci(range);
	}
}
