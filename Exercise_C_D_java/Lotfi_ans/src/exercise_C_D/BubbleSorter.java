package exercise_C_D;

import java.util.ArrayList;

public class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E>{

	@Override
	public void sort(ArrayList<Item<E>> s) {
		for(int i = 0; i < s.size() - 1; i++) {
			for(int j = s.size() - 1; j > i; j--) {
				// Swaps elements if previous is found to be greater than following
				if(s.get(j).getItem().compareTo(s.get(j-1).getItem()) < 0 ) {
					Item<E> temp = s.get(j-1);
					s.set(j-1, s.get(j));
					s.set(j,temp);
				}
			}
		}
	}

}
