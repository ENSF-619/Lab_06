/* ENSF 480 - Lab 5 Exercise A and B
 * M. Moussavi, October 2020
 * 
 */

class Item <E extends Number>implements Comparable<Item> {
	private E item;
	public Item(E value) {
		item = value;
	}
	
	public void setItem(E value){
		item = value;
	}
	
	public E getItem(){
		return item;
	}

	@Override
	public int compareTo(Item temp2) {
		if(item.doubleValue()>temp2.getItem().doubleValue())
			{
			return 1;
			}
		else if(item.doubleValue()<temp2.getItem().doubleValue())
			return -1;
		return 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return item+"";
	}
	
}
