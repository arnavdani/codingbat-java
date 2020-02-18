/* Given a string, compute a new string by moving the first char 
   to come after the next two chars, so "abc" yields "bca". Repeat 
   this process for each subsequent group of 3 chars, so "abcdef" 
   yields "bcaefd". Ignore any group of fewer than 3 chars at the end.

   oneTwo("abc") → "bca"
   oneTwo("tca") → "cat"
   oneTwo("tcagdo") → "catdog"
*/
public String oneTwo(String str) {
  String str1 = "";
  String str2 = "";
  if (str.length() < 3)
  {
    return "";
  }
  for (int i = 0; i < str.length()/3; i++)
  {
    str1 = str.substring(3*i, 3*i + 3);
    str2 += str1.substring(1, 3) + str1.substring(0,1);
    
  }
  return str2;
}
