package ExceptionHandling;

public class MainExecution {
public static void main(String[] args)  {
		
		EmployeeService service = new EmployeeService();
		String codes[] = service.getEmployeeCodes();
		
		
		String city;
		for (String empid : codes) {
		city=service.getcity(empid);
		System.out.println(empid+":"+city);
		}
        System.out.println("_____________Exception handling_______________");
        try
		{
			
			service.checkcity("101001011");
			service.checkcity("101001091");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
}



}

