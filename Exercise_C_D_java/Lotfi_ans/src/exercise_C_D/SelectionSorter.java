/*
 * SelectionSorter.java
 * ENSF 619-Lab 6- Exercise C&D 
 * Completed by: Ziad Chemali & Lotfi Hasni
 * Submission date: October 30, 2020
 */
package exercise_C_D;

import java.util.ArrayList;

public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {

	@Override
	public void sort(ArrayList<Item<E>> s) {
		for (int i = 0; i < s.size() - 1; i++)  
		{  
			int j = i;  
			
	        for (int k = i + 1; k < s.size(); k++){  
	        	if (s.get(k).getItem().compareTo(s.get(j).getItem())< 0){  
	                    j = k;
	            }  
	        }  
	        Item<E> temp= s.get(j);   
	        s.set(j, s.get(i));  
	        s.set(i, temp);  
	        }  
	}

}
