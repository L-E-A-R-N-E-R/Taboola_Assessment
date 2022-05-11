//Write a Java program that take a string input and convert it to an integer withoutusing the build-in parse function.
//Example: input value “123”, convert it to an integer type with value 123

/*I am assuming that the input string must have each character as a digit from 0-9. Any character otherwise would be an invalid string. */

import java.util.HashMap;
import java.util.Scanner;

public class Taboola_Q1 {
	public static void main(String[] args) {
		HashMap<Character,Integer> mapping = new HashMap<Character,Integer>();
		int sum=0,i=0;
		
		mapping.put('0',0);mapping.put('1',1);mapping.put('2',2);mapping.put('3',3);mapping.put('4',4);mapping.put('5',5);mapping.put('6',6);mapping.put('7',7);
		mapping.put('8',8);mapping.put('9',9);
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer string: ");
		String input = s.nextLine();
		
		if(input.isEmpty()) {                                       
			System.out.println("Invalid String");
		}
		
		else if(input.length()==1) {
			if(!mapping.containsKey(input.charAt(0))){
				System.out.println("Invalid String");
			}
			else
				System.out.println(mapping.get(input.charAt(0)));
		}
		
		else if(input.charAt(0)=='-') {
			for(i=1;i<input.length();i++) {
				if(!mapping.containsKey(input.charAt(i))) {
					System.out.println("Invalid String");
					return;
				}
			}
			for(i=1; i<input.length(); i++) {
				sum = sum*10 + (mapping.get(input.charAt(i)));
			}
			System.out.print("The converted integer is: " + (sum*-1));
		}

		else {
			for(i=0;i<input.length();i++) {
				if(!mapping.containsKey(input.charAt(i))) {
					System.out.println("Invalid String");
					return;
				}
				else {
					sum = sum*10 + (mapping.get(input.charAt(i)));
				}
			}
			System.out.print("The converted integer is: " + sum);
		}
	}
}
