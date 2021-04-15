package ExceptionHandling;


public class InvalidPincode extends Exception{
	
	private String excMsg = "";

	public InvalidPincode() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InvalidPincode(String message) {
		super(message);
		this.excMsg = message;
	}

	@Override
	public String toString() {
		return "PinCodeException :- "+excMsg;
	}}
