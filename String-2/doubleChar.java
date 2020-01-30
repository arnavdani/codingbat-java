/* Given a string, return a string where for every char in the original, there are two chars.

   doubleChar("The") → "TThhee"
   doubleChar("AAbb") → "AAAAbbbb"
   doubleChar("Hi-There") → "HHii--TThheerree"
   
   https://codingbat.com/prob/p165312
*/
public String doubleChar(String str) {
  String lol = "";
  for (int i  = 0; i <str.length();i++){
    lol += str.substring(i, i + 1) + str.substring(i, i +1);
  }
  return lol;
}
