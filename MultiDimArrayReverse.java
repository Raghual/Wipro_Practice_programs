package myproject;

import java.util.Scanner;

public class MultiDimArrayReverse {

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
		for(int i=n-1;i>=0;i--) {
			for(int j=m-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("\n");
		}

	}

}
