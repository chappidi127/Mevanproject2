package Practice;

public class Even_index_charecters {

	public static void main(String[] args) {
		String str="BhaskarReddy";
		char[] word=str.toCharArray();
		for(int i=0; i<=word.length-1;i++) {
			
			if(i%2 ==0) {
				System.out.print(" "+word[i]);
				System.out.print("commit for 08/05");
				
			}
			
		}

	}

}
