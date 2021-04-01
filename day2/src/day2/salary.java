package p1;
import java.util.Scanner;
public class salary {
	public void function(float basic_salary)
	{
		float hra,da,tax,total,takeaway_salary;
		hra=(float) (0.4*basic_salary);
		da=(float) (0.6*(basic_salary+hra));
		total=basic_salary+hra+da;
		float annual=total*12;
		if(annual<200000)
		{
			tax=0;
		}
		else if(annual>=200000 && annual<=600000)
		{
			tax=(float) (0.1*annual); 
		}
		else {
			tax=(float) (0.2*annual);
		}
		takeaway_salary=annual-tax;
		System.out.println("Takeaway  annual Salary is "+takeaway_salary+
				"\nHome Rental Allowance is "+hra+"\nDearness Allowance is "
				+da+"\nTAX is "+tax+"\nAnnual Salary without tax  is "+annual);
		
	}

		public static void main(String[] args) {
			float basic_salary;
			
			salary s=new salary();
			for(int i=1;i<=10;i++)
			{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the basic salary of  person"+i);
			basic_salary=sc.nextInt();
			s.function(basic_salary);
			}
			
			
		
	}
	}


