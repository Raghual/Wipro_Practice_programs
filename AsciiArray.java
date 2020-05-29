package myproject;

import java.util.Scanner;

public class AsciiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n;
		int b;
		char c;
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			b=arr[i];
			c=(char)b;
			if(i==0)
				System.out.print(c);
			else
				System.out.print(","+c);
		}
		
	}

}
