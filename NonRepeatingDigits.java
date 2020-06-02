package myproject;

import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeatingDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2002923,r,count=0;
		ArrayList<Integer>list1=new ArrayList<Integer>();
		while(n>0) {
			r=n%10;
			list1.add(r);
			n=n/10;
		}
		System.out.println(list1);
		HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
		for(int i=0;i<list1.size();i++) {
			if(hmap.containsKey(list1.get(i))) {
				hmap.put(list1.get(i), hmap.get(list1.get(i))+1);
			}
			else
				hmap.put(list1.get(i), 1);
		}
		for(int i=0;i<list1.size();i++) {
			if(hmap.get(list1.get(i))==1) {
				count=count+1;
			}
		}
		System.out.println(count); 
	}

}
