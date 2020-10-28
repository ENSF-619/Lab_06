import java.util.ArrayList;

public class BubbleSorter<E> implements Sorter {



	@Override
	public  void sort(ArrayList arr) {
		// TODO Auto-generated method stub
		int n = arr.size(); 
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
            	Item temp1 =  (Item) arr.get(j);
        		Item temp2=  (Item) arr.get(j+1);
                if (temp1.compareTo(temp2)==1)
                { 
                    // swap arr[j+1] and arr[j] 
                    arr.set(j, temp2);
                    arr.set(j+1, temp1);
                } 
	}

        }

	

}}
