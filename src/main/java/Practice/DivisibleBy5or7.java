package Practice;

import java.util.Iterator;

public class DivisibleBy5or7 {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=100;i++) {
			
			if(i%5== 0) {
				System.out.println("Divible by 5"+" = "+i);
			}
			
			if(i%7==0) {
				System.out.println("Divible by 7"+" = "+i);
			}
			
			if(i%5==0 && i%7==0) {
				System.out.println("Divible by 5 & 7" +" = "+i);
				
				System.out.println("Upendra testing");
			}
					}
		

	}

}
