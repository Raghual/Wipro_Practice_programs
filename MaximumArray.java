package myproject;

import java.util.Scanner;

public class MaximumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max;
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}

}
