
public class Item {
	private String name;
	private int quantity;
	private double price;
	private Item next;

	public Item(){
		quantity = 0;
		setNext(null);
	}
	
	public Item(String name, int quantity, double price, Item next) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.setNext(next);
	}
	//Getters for the Items
	public void setNode(Item node){
		setNext(node);
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String itemName){
		name = itemName;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int itemQuantity){
		quantity = itemQuantity;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double itemPrice){
		price = itemPrice;
	}

	public Item getNext() {
		return next;
	}

	public void setNext(Item next) {
		this.next = next;
	}

}
