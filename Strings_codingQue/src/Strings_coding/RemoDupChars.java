package Strings_coding;

public class RemoDupChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="Alakuntlavasu";
		
		StringBuilder b1=new  StringBuilder();
		
		str1.chars().distinct().forEach(c->b1.append((char)c));
		
//		System.out.println(b1);
		
		System.out.println(b1);

	}

}
