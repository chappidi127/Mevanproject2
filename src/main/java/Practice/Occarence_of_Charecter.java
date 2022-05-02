package Practice;

import java.util.HashMap;
import java.util.Map;

public class Occarence_of_Charecter {
	
	
	public static  void getcharcount(String name){
		
	Map<Character, Integer> charmap=new HashMap<Character, Integer>();
	
	char strarray[]=name.toCharArray();
	 	for(char c:strarray) {
	 		
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
		
		getcharcount("Bhaskarreddy");
		

	}

}
