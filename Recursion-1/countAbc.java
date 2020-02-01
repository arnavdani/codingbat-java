/* Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

   countAbc("abc") → 1
   countAbc("abcxxabc") → 2
   countAbc("abaxxaba") → 2
   
   https://codingbat.com/prob/p161124
*/
public int countAbc(String str) {
  if(str.indexOf("abc") == -1 && str.indexOf("aba") == -1)
    return 0;
  else if(str.indexOf("aba")!= -1)
    return 1 + countAbc(str.substring(str.indexOf("aba") + 1));
  else if(str.indexOf("abc")!= -1)
    return 1 + countAbc(str.substring(str.indexOf("abc") + 1));

  return 0;  
}
