package myproject;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n,r,sum=0,temp;
		n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is Palindrome");
		else
			System.out.println(temp+" is not a Palindrome");
	}

}
