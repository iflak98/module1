package lab1;

import java.util.Scanner;
public class trafficlights{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("SELECT THE OPTION FROM \nred-->1\nyellow-->2\ngreen-->3\n");
	
	int x = sc.nextInt();
	switch(x) {
	case 1: System.out.println("STOP!");
	break;
	case 2: System.out.println("READY");
	break;
	case 3: System.out.println("GO");
	break;
	default:System.out.println("INVALID"); 
	
		}

	
	}
}