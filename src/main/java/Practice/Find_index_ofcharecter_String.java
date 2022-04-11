package Practice;

public class Find_index_ofcharecter_String {

	public static void main(String[] args) {
		String str="Bhaskarreddy";
		int index=0;
		char[] ch= str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='k') {
				index=i;
				
				
			}
		}
  System.out.println("index "+index);
	}

}
