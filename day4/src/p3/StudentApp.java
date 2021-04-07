package p3;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args)
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		int n;
		do {
		System.out.println("Enter the name of student");
		String name=sc.next();
		s.setName(name);
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		s.setMarks(marks);
		System.out.println("enter current fees");
		int fees=sc.nextInt();
		s.setFees(fees);
		s.calculateFees(marks);
		System.out.println("Do you want to cont..<0 to exit>");
		n=sc.nextInt();
		}while(n !=0);
	}
}
