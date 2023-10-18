package EasyProblems;
import java.nio.charset.Charset;
import java.util.*;

public class NewAlphabet {
	
	public static void main (String [] args) {
		
		//create new Scanner 
		Scanner scanner = new Scanner (System.in);
		
		//convert alphabet
		HashMap<Character, String> newAlphabet = new HashMap<>();
		newAlphabet.put('a', "@");
		newAlphabet.put('b', "8");
		newAlphabet.put('c', "(");
		newAlphabet.put('d', "|)");
		newAlphabet.put('e', "3");
		newAlphabet.put('f', "#");
		newAlphabet.put('g', "6");
		newAlphabet.put('h', "[-]");
		newAlphabet.put('i', "|");
		newAlphabet.put('j', "_|");
		newAlphabet.put('k', "|<");
		newAlphabet.put('l', "1");
		newAlphabet.put('m', "[]\\/[]");
		newAlphabet.put('n', "[]\\[]");
		newAlphabet.put('o', "0");
		newAlphabet.put('p', "|D");
		newAlphabet.put('q', "(,)");
		newAlphabet.put('r', "|Z");
		newAlphabet.put('s', "$");
		newAlphabet.put('t', "']['");
		newAlphabet.put('u', "|_|");
		newAlphabet.put('v', "\\/");
		newAlphabet.put('w', "\\/\\/");
		newAlphabet.put('x', "}{");
		newAlphabet.put('y', "`/");
		newAlphabet.put('z', "2");
		
		String input = scanner.nextLine();
		input = input.toLowerCase();
		
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (newAlphabet.containsKey(input.charAt(i))) {
				output += newAlphabet.get(input.charAt(i));
			}
			else {
				output += input.charAt(i);
			}
		}
		
		System.out.println(output);
	}

}
