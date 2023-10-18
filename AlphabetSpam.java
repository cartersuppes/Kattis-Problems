package EasyProblems;

import java.util.Scanner;

public class AlphabetSpam {
	
	public static void main (String [] args) {
		
		Scanner s = new Scanner(System.in);
		
		String input = s.nextLine();
		
		double spaceCounter = 0;
		double lowercaseCounter = 0;
		double uppercaseCounter = 0;
		double symbolsCounter = 0;
		
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 95) {
				spaceCounter++;
			}
			else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
				lowercaseCounter++;
			}
			else if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
				uppercaseCounter++;
			}
			else if ((input.charAt(i) >= 33 && input.charAt(i) <= 64)  || (input.charAt(i) >= 91 && input.charAt(i) <= 94) || (input.charAt(i) == 96) || input.charAt(i) >= 123 && input.charAt(i) <= 126) {
				symbolsCounter++;
			}
		}
		System.out.println(spaceCounter / input.length());
		System.out.println(lowercaseCounter / input.length());
		System.out.println(uppercaseCounter / input.length());
		System.out.println(symbolsCounter / input.length());
		
	}
	
}
