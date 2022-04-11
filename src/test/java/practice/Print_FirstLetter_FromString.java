package practice;

import java.util.Iterator;

public class Print_FirstLetter_FromString {

	public static void main(String[] args) {
		
		
		String str1="The Page not Found 404";
		String []str=str1.split(" ");
		for(int i=0;i<str.length;i++) {
			
			char [] ch= str[i].toCharArray();
			
			 System.out.print(ch[0]+" "+" ");
			
		}
 
	}
	 
}
