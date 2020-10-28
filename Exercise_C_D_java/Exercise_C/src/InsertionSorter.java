import java.util.ArrayList;

public class InsertionSorter implements Sorter {

	@Override
	public void sort(ArrayList arr) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < arr.size(); i++) 
	    {  
	        Item key = (Item) arr.get(i);  
	        int j = i - 1;  
	        /* Move elements of arr[0..i-1], that are  
	        greater than key, to one position ahead  
	        of their current position */
	        while (j >= 0 && ((Item) arr.get(j)).compareTo(key)> 0) 
	        {  
	            Item temp2 = (Item) arr.get(j);
	            arr.set(j+1,temp2);
	            j --;  
	        }  
	        arr.set(j+1,key);
	    }  
	}



}
