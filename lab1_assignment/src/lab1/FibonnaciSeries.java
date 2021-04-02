package lab1;

public class FibonnaciSeries{  
public static void main(String args[])  
{    
 int f1=0,f2=1,f3,i,count=10;    
 System.out.print(f1+" "+f2);
    
 for(i=2;i<count;++i)  
 {    
  f3 =f1 + f2;    
  System.out.print(" "+ f3);    
  f1 = f2;    
  f2 = f3;    
 }    
  
}}  