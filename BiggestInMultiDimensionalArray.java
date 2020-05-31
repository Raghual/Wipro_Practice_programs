package myproject;

import java.util.Scanner;

public class BiggestInMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int m=3;
		Scanner s= new Scanner(System.in);
		int [][]arr=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		int max=arr[0][0];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
		
		}

	}
		System.out.println(max);


	}

}
