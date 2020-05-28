package myproject;

import java.util.Scanner;

public class PositiveNegativeZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner s= new Scanner(System.in);
		a=s.nextInt();
		b=Math.abs(a);
		if(a!=0) {
		if(a==b)
			System.out.println("positive");
		else
			System.out.println("negative");
		}
		else
			System.out.println("Zero");
		
		

	}

}
