package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0]);
		for(int i=1;i<n;i++) {
			System.out.print(","+arr[i]);
		}
	}

}
