/* A sandwich is two pieces of bread with something in between. 
   Return the string that is between the first and last appearance 
   of "bread" in the given string, or return the empty string "" 
   if there are not two pieces of bread.

   getSandwich("breadjambread") → "jam"
   getSandwich("xxbreadjambreadyy") → "jam"
   getSandwich("xxbreadyy") → ""
*/
public String getSandwich(String str) {
    int front = str.indexOf("bread");
    int last = 0;
   
    for (int i = 0; i < str.length() - 4; i++)
    {
      String str1 = str.substring(i);
      if (str1.indexOf("bread") != -1)
      {
        last = i;
      }
      
    }
    if (front == last || front == -1)
    {
      return "";
    }
    return str.substring(front +5, last);
    */
    int front = str.indexOf("bread");
    int last = str.lastIndexOf("bread");
    if (front == last)
    {
      return "";
    }
    return str.substring(front + 5, last);
}
