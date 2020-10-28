import java.util.ArrayList;

public class MyVector {
private ArrayList<Item> storageM;
private Sorter sorter;
	public MyVector(int n) {
		storageM=new ArrayList<Item>(n);
	}
	public MyVector(ArrayList<Item> arr) {
		this.storageM=arr;
	}
	public void add(Item value) {
		storageM.add(value);
	}
	public void performSort() {
		sorter.sort(storageM);
	}
	public void setSortStrategy(Sorter sorter) {
		this.sorter=sorter;
	}
	public void display() {
		System.out.println(storageM.toString());
	}

	
}
