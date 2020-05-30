package myproject;

import java.util.Scanner;

public class RemovingDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int j=0;
		int temp[]=new int[n];
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp[j]=arr[i];
				j++;
		}
	}
		temp[j++] = arr[n-1]; 
		for(int i=0;i<j;i++) {
			System.out.println(temp[i]);
		}

}
}

