/* Given a string, compute recursively a new string where all the 'x' chars have been removed.
   
   noX("xaxb") → "ab"
   noX("abc") → "abc"
   noX("xx") → ""
*/
public String noX(String str) {
  if(str.indexOf("x") == -1)
    return str;
  return noX(str.substring(0, str.indexOf("x")) + str.substring(str.indexOf("x") + 1));
}
