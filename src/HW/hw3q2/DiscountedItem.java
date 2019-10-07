package hw3q2;

/**
A decorator for an item that applies a discount.
*/
public class DiscountedItem implements LineItem
{
/**
   Constructs a discounted item.
   @param item the item to be discounted
   @param discount the discount percentage
*/
public DiscountedItem(LineItem item, double discount) 
{ 
   this.item = item; 
   this.discount = discount;
   this.duplicates = 1;
}

public double getPrice() 
{
   return item.getPrice() * (1 - discount / 100); 
}

public String toString()
{
   return item.toString() + " (Discount " + discount
      + "%)";
}

public int getDuplicates() {
	return duplicates;
}

public int increaseDuplicates() {
	duplicates++;
	return duplicates;
}

private LineItem item;
private double discount;
private int duplicates;
}
