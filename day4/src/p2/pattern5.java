package p2;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);// scanf or cin 
		int choice = 0;
		do
		{
			System.out.println(" Enter rows :- ");
			
			int row = sc.nextInt();
			
			int currentRow = 1;
			int j=0;
			//currentRow=1;
			while(currentRow <= row)
			{
				int star = row;
				
				while(star>=currentRow)
				{
					System.out.print("  ");
					star--;
					
				}
				
				for(int i=1;i<=currentRow+j;i++)
				System.out.print("* ");
				System.out.print("\n");
				j++;
				//n++;
				currentRow++;
			}
		//	System.out.println(currentRow+" "+j);
			currentRow=2;
			
			while(currentRow <= row)
			{
				int star = 1;
				
				while(star<=currentRow)
				{
					System.out.print("  ");
					star++;
					
				}
				
				for(int i=1;i<=currentRow+j;i++)
				System.out.print("* ");
				System.out.print("\n");
				j=j-3;;
				//n++;*/
				currentRow++;
			}
			
			System.out.println(" Do u want to exe more <0 for exit>");
			choice = sc.nextInt();
		}while(choice!=0);
	}
}
		

