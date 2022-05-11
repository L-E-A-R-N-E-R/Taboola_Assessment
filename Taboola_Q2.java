//Write a Java program that take a input and detect whether there’s integer in there.
//Example: input value “45222” return true, input value “This Is A Test4me” return
//true, input value “IAMGOOD” return false

import java.io.*;
import java.util.*;

public class Taboola_Q2 {
	
	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.println("Enter a random string");
		String temp = str.nextLine();
		System.out.println("The entered string is: " + temp);
		boolean b = has_integer(temp);
		System.out.println(b);
	}
	
	public static boolean has_integer(String temp2) {
		HashSet<Character> set = new HashSet<>();
		set.add('0');set.add('1');set.add('2');set.add('3');set.add('4');set.add('5');set.add('6');set.add('7');set.add('8');set.add('9');
		
		for(int i=0; i<temp2.length(); i++) {
			if(set.contains(temp2.charAt(i)))
				return true;
		}
		return false;
	}
}