package exercise_C_D;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MyVector<E extends Number & Comparable<E>>{
	
	private ArrayList <Item<E>> storageM;
	private Sorter<E> sorter;
	
	MyVector(int n){
		storageM = new ArrayList<Item<E>>(n);
	}

	MyVector(ArrayList <Item<E>> arr){
		ArrayList <Item<E>> newStorageM = new ArrayList<Item<E>>(arr.size());
		for(Item<E> i: arr) {
			newStorageM.add(new Item<E> (i.getItem()));
		}
		storageM = newStorageM;
	}
	
	public void add(Item<E> value) {
		storageM.add(value);
	}
	
	public void setSortStrategy(Sorter<E> s) {
		sorter = s;
	}
	
	public void performSort() {
		sorter.sort(storageM);
	}
	
	public void display() {
		//DecimalFormat f = new DecimalFormat(".#");
		for(Item<E> i: storageM)
			System.out.print(i.getItem() + " ");
		System.out.println();
	}
	
}
