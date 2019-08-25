//package prereq;

public class Strings
{
	
   public static String uniqueLetters(String str)
   {
	   String endResult = str;
	   char a = 0;
	   for (int i = 0; i<str.length();i++) 
	   {
		   for (int l = 0; l<str.length();l++) {
			   if (str.charAt(l) == str.charAt(i) && l != i)
				   endResult = endResult.replace(str.charAt(l),a);
		   }
	   }
	   return endResult.replace("\0", "");
   }
}
