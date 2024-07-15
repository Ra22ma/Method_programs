import java.util.Scanner;
class AreaOfCircleMethod

{
	public static void getArea(double r) 
	{
		System.out.println("Area of circle is:"+3.14*r*r);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of cicle:");
		double r=sc.nextDouble();
		getArea(r);
	}
}
