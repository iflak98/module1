package lab3;

public class NextAlpha {
	public void afterString(String st)
	{
	for(int i=0;i<st.length();i++) {
		
		if(st.charAt(i)!='a' && st.charAt(i)!='e' && st.charAt(i)!='i' && st.charAt(i)!='o' &&  st.charAt(i)!='u' && st.charAt(i)!='A' && st.charAt(i)!='E' && st.charAt(i)!='I' && st.charAt(i)!='O' && st.charAt(i)!='U')
			System.out.print((char) (st.charAt(i)+ 1));
			
		else
		System.out.print(st.charAt(i));
		
		
	}
	
	}
	public static void main(String[] args) {
		NextAlpha nex=new NextAlpha();
		String st="JAVA";
		
		nex.afterString(st);
	}
}
