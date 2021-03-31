package day2;
import java.util.Arrays;

public class arrays {
	
	 
		public static int removeDuplicate(int arr[], int n){  
		        
		        int[] temp = new int[n];  
		        int j = 0;  
		        for (int i=0; i<n-1; i++)
		        {  
		        	
		            if (arr[i] != arr[i+1])
		            {  
		                temp[j++] = arr[i];  
		            }  
		         }  
		         temp[j++] = arr[n-1];     
		          
		        for (int i=0; i<j; i++){  
		            arr[i] = temp[i];  
		        }  
		        return j;  
		    }  
		       
		    public static void main (String[] args) {  
		        int arr[] = {10,3,4,10,3};  
		        Arrays.sort(arr);
		        int length = arr.length;  
		        length = removeDuplicate(arr, length);  
		       
		        for (int i=0; i<length; i++)  
		           System.out.print(arr[i]+" ");  
		    }  
		}


