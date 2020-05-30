package myproject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class DuplicatesUsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,a;
		n=s.nextInt();
		ArrayList<Integer>list1 = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			a=s.nextInt();
			list1.add(a);
		}
		HashSet<Integer> set=new HashSet<Integer>(list1);
		ArrayList<Integer>list2=new ArrayList<Integer>(set);
		for(Object ob:list2)
			System.out.println(ob);
		
		
		
		
	}

}
