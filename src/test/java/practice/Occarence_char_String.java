package practice;

import java.util.HashMap;
import java.util.Map;

public class Occarence_char_String {
	
	public static void stringcount(String name) {
		
		
		
		Map<Character, Integer> charmap=new HashMap<Character, Integer>();
		char [] charry=name.toCharArray();
		for(char c:charry) {
			if(charmap.containsKey(c)) {
				charmap.put(c, charmap.get(c)+1);
			}
			else {
				charmap.put(c, 1);
				
			}
			
			}
		System.out.println(name+" "+charmap);
		
		
		
		
	}

	public static void main(String[] args) {
		
		stringcount("BhaskarreddyBangalore");
	

	}

}
