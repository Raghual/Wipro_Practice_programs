package myproject;

import java.util.Scanner;

public class Alphaber_0r_integer_or_Specialcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		char a = s.next().charAt(0); 
		if((a>=65 && a<=90)||(a>=97 && a<=122)) {
			System.out.println("Alphabet "); 
		}
		else if(a>=48 && a<=57) {
			System.out.println("Digit");
		}
		else
			System.out.println("Special Character");
		
	}

}
