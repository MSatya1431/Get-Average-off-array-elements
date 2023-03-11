
import java.util.Scanner;

public class AverageUsingArray 
{
	public static float average(int arr[])
	{
		float avg=0;
		for(int i=0;i<arr.length;i++)
		{
			avg+=arr[i];
		}
		avg=avg/arr.length;
		return avg;
	}
	public static void main(String[] args) throws Exception
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=Integer.parseInt(sc.next());
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(sc.next());
		}
		double result=average(arr);
		System.out.println("Average: "+(double)Math.round(result*100)/100);
	}
}
