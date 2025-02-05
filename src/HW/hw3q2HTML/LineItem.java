package hw3q2HTML;

/**
A line item in an invoice.
*/
public interface LineItem
{
	
/**
   Gets the price of this line item.
   @return the price
*/
double getPrice();
/**
   Gets the description of this line item.
   @return the description
*/   
String toString();

int getDuplicates();
int increaseDuplicates();
}
