/*Euclidean Algorithm
1/31/13
*/
import java.util.Scanner;
public class EuclidEx
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Please enter a non-negative integer a: ");
		int a=sc.nextInt();

		System.out.println("Please enter a non-negative integer b: ");
		int b=sc.nextInt();

		int r0=a, r=b, r1=r0%r, q=r0/r, x0=1, x=0, x1=x0-q*x, y0=0, y=1, y1=y0-q*y;

		System.out.println("r\t\tq\t\tx\t\ty");
		System.out.println(r0+"\t\t--"+"\t\t"+x0+"\t\t"+y0);
		System.out.println(r+"\t\t--"+"\t\t"+x+"\t\t"+y);

		while (r1>0)
		{
			x0=x;
			x=x1;
			y0=y;
			y=y1;
			r0=r;
			r=r1;
			System.out.println(r+"\t\t"+q+"\t\t"+x+"\t\t"+y);
			q=r0/r;
			r1=r0%r;
			x1=x0-q*x;
			y1=y0-q*y;
			
		}
		System.out.println("\nGCD is: "+r+"\nx is: "+x+"\ny is: "+y);
	}
}