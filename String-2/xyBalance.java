/* We'll say that a String is xy-balanced if for all the 'x' chars in the string, 
   there exists a 'y' char somewhere later in the string. So "xxy" is balanced, 
   but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given 
   string is xy-balanced.

   xyBalance("aaxbby") → true
   xyBalance("aaxbb") → false
   xyBalance("yaaxbb") → false
*/
public boolean xyBalance(String str) {
  int indexX = 0;
  int indexY = 0;
  boolean xy = true;
  for (int i = 0; i < str.length(); i++)
  {
    String str1 = str.substring(i);
    if (str1.indexOf("x") > str1.indexOf("y"))
    {
      String str2 = str.substring(i+1);
      if (str2.indexOf("y") == -1)
      {
        return false;
      }
    }
  }
  
  return true;
}
