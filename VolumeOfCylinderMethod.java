import java.util.Scanner;
class VolumeOfCylinderMethod

{
	public static void getVolume(double r,double h) 
	{
		System.out.println("volume of cylinder is:"+3.14*r*r*h);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		double r=sc.nextDouble();
		double h=sc.nextDouble();
		getVolume(r,h);
		
	}
}
