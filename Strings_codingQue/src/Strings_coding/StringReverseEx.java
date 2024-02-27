package Strings_coding;

public class StringReverseEx {

	public static void main(String[] args) {
	

		String str="hello";
		
		
	// Approach 1	
		char[] chAr=str.toCharArray();
		
		for(int i= chAr.length-1;i>=0;i--) 
		{
//			System.out.println(chAr[i]);
			System.out.print(chAr[i]);
		}
		
		System.out.println("");
		
		// Approach 1
		
		for(int i=str.length()-1; i>=0;i--) {
			
			System.out.println(str.charAt(i));
		}
		
		// Approach 1
		
		StringBuffer br=new StringBuffer(str);
		System.out.println(br.reverse());
		
	}

}
