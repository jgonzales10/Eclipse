
public class Shoppinglist {
	private int listCount;
    private Item head;

    public Shoppinglist(){
    	head = new Item();
    	listCount = 0;
    }
    public void add(String name, int quantity, double price){
		Item temp = new Item(name, quantity, price);
		Item current = head;
		// starting at the head node, crawl to the end of the list
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		// the last node's "next" reference set to our new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
    }
    public void add(String name, int quantity, double price, int index)
	// post: inserts the specified element at the specified position in this list.
	{
		Item temp = new Item(name, quantity, price);
		Item current = head;
		// crawl to the requested index or the last element in the list,
		// whichever comes first
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		// set the new node's next-node reference to this node's next-node reference
		temp.setNext(current.getNext());
		// now set this node's next-node reference to the new node
		current.setNext(temp);
		listCount++;// increment the number of elements variable
	}
    
    
    
    
		public int size(){
			return listCount;
		}
		/* public String toString(){
			Item current = head.getNext();
			String output = "";
			while(current != null)
			{
				output += "[" + current.getQuantity().toString() + "]";
				current = current.getNext();
			}
			return output;
		}
		*/
}