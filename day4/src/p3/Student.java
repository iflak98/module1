
	package p3;
	/*  student business logic and student as an entity */
	public class Student {
		String name;
		int marks;
		double fees;
		// add property of student
		
		
		// add getters and setters
		
	
		
		public String getName() {
			return name;
		}

		public int getMarks() {
			return marks;
		}

		public void setMarks(int marks) {
			this.marks = marks;
		}

		public void setName(String name) {
			this.name = name;
		}


		public double getFees() {
			return fees;
		}

		public void setFees(double fees) {
			this.fees = fees;
		}

		/*  trigger
		 *  if student marks is less than 50 
		 *  ---->> fees += 50%
		 * */
		public void calculateFees(int marks)
		{
			if(marks<50)
			fees=(double) 0.5*fees+fees;
			
			System.out.println("fees of student is-->"+fees);
			
			
		}

	}


