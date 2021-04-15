package ExceptionHandling;
public class EmailFilters {
	
	String emails[] = {
			
			"ramesh@gmail.com",
			"rakesh@outlook.com",
			"lokesh@linkedin.com",
			"mahesh@gmail.com",
			"ganesh@gmail.com",
			"rajesh@outlook.com"
	};
	int count;
	
	public static void main(String[] args) {
		EmailFilters e=new EmailFilters();
		//System.out.println(e.emails);
		int gmail=0,outlook=0,link=0;
		for(int i=0;i<e.emails.length;i++)
		{
			
			if(e.emails[i].endsWith("@gmail.com")){
				gmail++;
				
			}
			else if(e.emails[i].endsWith("@outlook.com")) {
				outlook++;
				
			}
			else
			{
				link++;
				
			}
			
		}
		System.out.println("@gmail.com-->"+gmail);
		System.out.println("@outlook.com-->"+outlook);
		System.out.println("@linkedin.com--->"+link);
		/*
		 * Write the code to count the number of users in particular 			domain
		 * for example 
		 * gmail has 3 users
		 * outlook has 2 users
		 * linkedin has 1 user
		 *  
		 * HINT : use endsWith() of String class
		 * */
		
 	
	}

}
