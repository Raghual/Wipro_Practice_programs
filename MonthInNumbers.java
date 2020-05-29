package myproject;

import java.util.Scanner;

public class MonthInNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		switch(a) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		case ' ':
			System.out.println("Please enter the month in numbers");
			break;
		default:
			System.out.println("Please enter valid  number");
			break;
			
		}
		

	}

}
