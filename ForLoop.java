/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2014/4/12
 */


public class ForLoop {
	public static void main(String[] args) {
		int i =0;
		for(; i< 5;) {
			for (int j= 0; j < i ; j++) {
				System.out.print("*");
			}
			 i++;
			System.out.println();
		}
		i =0;
		while(i< 5) {
			int j = 0;
			while(j < i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}
		
		i =0;
		
		do {
			int j = 0;
			while(j < i) {
				System.out.print("*");
				j++;
			}
			i++;
			System.out.println();
		}while(i< 5);
		
		
	}    
    
}