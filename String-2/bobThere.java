/* Return true if the given string contains a "bob" string, 
   but where the middle 'o' char can be any char.

   bobThere("abcbob") → true
   bobThere("b9b") → true
   bobThere("bac") → false
   
   https://codingbat.com/prob/p175762
*/
public boolean bobThere(String str) {
  
  for (int i = 0; i <str.length() - 2; i++)
  { 
    str = str.substring(i);
    int firstB = str.indexOf("b");
    if (str.substring(firstB).length() < 3)
    {
      return false;
    }
    else
    {
      if (str.charAt(firstB+2) == 'b')
      {
        return true;
      }
    }
  }
  return false;
}
