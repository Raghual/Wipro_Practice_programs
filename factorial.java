package myproject;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=1;i<n;i++) {
			if(n%i==0)
				a[i-1]=i;
		}
		int k=a.length;
		System.out.println(k);
		for(int i=0;i<k;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
