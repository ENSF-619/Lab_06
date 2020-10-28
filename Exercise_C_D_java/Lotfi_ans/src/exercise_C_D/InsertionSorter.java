package exercise_C_D;

import java.util.ArrayList;

public class InsertionSorter <E extends Number & Comparable<E>> implements Sorter<E>{

	@Override
	public void sort(ArrayList<Item<E>> s) {
	// Traverses unsorted portion of array
		for(int i = 1; i < s.size(); i++) {
			Item<E> current = s.get(i);
			int j = i - 1;
			// If current element smaller than preceding element, shifts elements forward to make space
			while(j >= 0 && s.get(j).getItem().compareTo(current.getItem()) > 0) {
				s.set(j+1, s.get(j));
				j = j - 1; 
			}
			// Inserts current element in its proper place
			s.set(j+1, current);
		}
	}

}
