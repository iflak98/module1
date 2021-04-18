package lab3;
import java.util.Scanner; 
public class Sentance {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text");
		String s=sc.next();
	//	String s = "ahgsch\naxyyx\rsxhgc";
		char arr[] = s.toCharArray();
		System.out.println(arr.length);
		String arr1[] = s.split("\r\n|\r|\n");
		System.out.println(arr1.length);
        String arr2[] = s.split(" ");
        System.out.println(arr2.length);
        sc.close();
	}

}