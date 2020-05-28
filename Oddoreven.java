package myproject;

import java.util.Scanner;

public class Oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		if(a%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}