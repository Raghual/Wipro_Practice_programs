package myproject;

import java.util.Arrays;
import java.util.Scanner;


public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner (System.in);
		n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
	}

}
