package myproject;

import java.util.Scanner;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		int p;
		int i=0;
		int flag=1;
		System.out.println("Enter n:");
		n=s.nextInt();
		System.out.println("Enter p:");
	    p = s.nextInt();
		System.out.println("Enter array elements");
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
	}
		for( i=0;i<n;i++) {
			if(arr[i]==p) {
				flag=1;
				break;
			}
			else
				flag=0;
				
			
		}
		if(flag==0) {
			System.out.println("-1");
		}
		else
			System.out.println(i);
			
			
		

	}

}
