package myproject;

import java.util.Scanner;

public class ArraysSumAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int size,sum=0,avg;
		size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	    avg=sum/size;
	    System.out.println(avg);
	    
	

}
}
