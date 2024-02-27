package Strings_coding;

public class String_Duplicate_characters {

	public static void main(String[] args) {

		String st="Alakuntla";
		
		StringBuilder sb=new StringBuilder();
		st.chars().distinct().forEach(c->sb.append((char)c));
		
		System.out.println(sb);

	}

}
