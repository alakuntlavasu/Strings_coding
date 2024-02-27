package Strings_coding;

public class StringsReverseWord {

	public static void main(String[] args) {
	
		String st="Welcome to Alakuntla vasu";
		
		 String splitString[]=st.split(" ");
		 
		 for(int i=splitString.length-1;i>=0;i--) {
			 System.out.println(splitString[i]);
			 
		 }
		

	}

}
