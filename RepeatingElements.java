package myproject;

import java.util.HashMap;

public class RepeatingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {1,1,1,1,2,3};
		
		HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		
		hmap.put(arr[0], 1);
		
		int maxFrequency =  1;
		int maxElement = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			boolean keyExists = hmap.containsKey(arr[i]);
			if(keyExists) {
				int existingFreq = hmap.get(arr[i]);
				hmap.put(arr[i], existingFreq+1);
			}else {
				hmap.put(arr[i],1);
			}
			
			int freq = hmap.get(arr[i]);
			if(freq > maxFrequency) {
				maxFrequency = freq;
				maxElement = arr[i];
			}

		}
		
		
			System.out.println(maxElement);
		}
		

	}


