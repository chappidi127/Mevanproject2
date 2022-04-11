package practice;

public class Retrieve_Number_FromString {

	public static void main(String[] args) {
		
		
		String str1="The Page not Found 404";
		String Str2= "internal Server 500 Error ";
		
		System.out.println("The number part in str1 is "+" "+str1.replaceAll("[^0-9]",""));
		
		System.out.println("The Number part in str2 is "+" "+Str2.replaceAll("[^0-9]", ""));
	}						

}
