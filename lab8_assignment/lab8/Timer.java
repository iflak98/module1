package lab8;
import java.util.*;

public class Timer implements Runnable {
	
	@Override
	public void run() {
		
		
		System.out.println("Thread refresh 10 seconds");
		
		
	}
	
	public static void main(String args[]) throws InterruptedException {
		Timer t = new Timer();
		Thread t1 = new Thread(t);
		t1.start();
		t1.sleep(10000);
		
		
	}
}