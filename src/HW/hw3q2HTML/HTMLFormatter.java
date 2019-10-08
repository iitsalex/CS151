package hw3q2HTML;

/**
A simple invoice formatter.
*/
public class HTMLFormatter implements InvoiceFormatter
{
public String formatHeader()
{
   total = 0;
   return "<body style='background-color:rgb(0, 151, 255);'><h1 style='text-align:center;color:Yellow;font-size:24px;'>" + 
		   "I N V O I C E </h1>";
   
}

public String formatLineItem(LineItem item)
{
   total += (item.getPrice() * item.getDuplicates());
   return (String.format(
         "<p style=color:yellow;font-size:16px;'>" + "<em>\n%s: <span style='color:rgb(2,111,0);'>$%.2f</span>" + 
        		 "<span style='color:rgb(255,0,162);'> (x%d)</span>" + "</em>",item.toString(),item.getPrice(),item.getDuplicates()));
}

public String formatFooter()
{
   return (String.format("<p style=color:yellow;font-size:16px;'><br><br>" + 
		   "TOTAL DUE: <span style=color:rgb(255,0,162);'>$%.2f<br><br></span></p>", total));
}

private double total;
}
