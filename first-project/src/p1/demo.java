package p1;
import java.util.Scanner;
public class demo {
	public static void main(String args[]) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter marks of ENGLISH");
	int englishmarks = sc.nextInt();
	System.out.println("Enter marks of java");
	int java= sc.nextInt();
	System.out.println("Enter marks of db");
	int db= sc.nextInt();
	System.out.println("Enter marks of springTools");
	int springTools= sc.nextInt();
	int total=englishmarks+java+db+springTools;
	float avg=total/4;
	System.out.println("Total Marks= "+total);
	System.out.println("average Marks= "+avg);
	
	}

}
