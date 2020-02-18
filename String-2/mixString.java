/* Given two strings, a and b, create a bigger string made of the 
   first char of a, the first char of b, the second char of a, 
   the second char of b, and so on. Any leftover chars go at the 
   end of the result.

   mixString("abc", "xyz") → "axbycz"
   mixString("Hi", "There") → "HTihere"
   mixString("xxxx", "There") → "xTxhxexre"
*/
public String mixString(String a, String b) {
    String res = "";
    for (int i = 0; i < Math.min(a.length(), b.length()); i++)
        res += "" + a.charAt(i) + b.charAt(i);
    if (a.length() > b.length())
        return res + a.substring(b.length());
    return res + b.substring(a.length());
}
