package myproject;

import java.util.Scanner;

public class ColorCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner s= new Scanner(System.in);
		ch=s.next().charAt(0);
		if(Character.isLowerCase(ch)) 
			ch=Character.toUpperCase(ch);
		switch(ch) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'G':
			System.out.println("Green");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Enter Valid Character");
			break;
			
			
			
		}
		

	}

}
