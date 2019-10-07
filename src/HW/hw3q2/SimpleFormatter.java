package hw3q2;

/**
A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
public String formatHeader()
{
   total = 0;
   return "     I N V O I C E\n\n\n";
}

public String formatLineItem(LineItem item)
{
   total += (item.getPrice() * item.getDuplicates());
   return (String.format(
         "%s: $%.2f x%d\n",item.toString(),item.getPrice(),item.getDuplicates()));
}

public String formatFooter()
{
   return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
}

private double total;
}
