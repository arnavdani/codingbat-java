/* Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

   countX("xxhixx") → 4
   countX("xhixhix") → 3
   countX("hi") → 0
   
   https://codingbat.com/prob/p170371
*/
public int countX(String str) {
  if (str.indexOf("x") == -1)
  {
    return 0;
  }
  else return 1 + countX(str.substring(str.indexOf("x")+ 1));
}
