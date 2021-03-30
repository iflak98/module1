package p1;
import java.util.Scanner;
public class date {
	
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the date");
		int dd=sc.nextInt();

		int last_digit=dd%10;
		if(dd==0)
		{
			System.out.println("ERROR");
		}
		else if(dd<32) {
		if(dd>=10 && dd<=19||last_digit==0)
		{
			System.out.println(""+dd+"th");
		}
		else if(last_digit==1)
		{
			System.out.println(""+dd+"st");
		}
		else if(last_digit==2) {
			System.out.println(""+dd+"nd");
		}
		
		else if(last_digit==3)
		{
			System.out.println(""+dd+"rd");
		}
		else
		{
			System.out.println(""+dd+"th");
		}
	}
	else
	{
		System.out.println("Error");
	}
		
	}
}
