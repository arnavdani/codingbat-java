/* Given a string and a non-empty substring sub, compute recursively 
   the largest substring which starts and ends with sub and return its length.

   strDist("catcowcat", "cat") → 9
   strDist("catcowcat", "cow") → 3
   strDist("cccatcowcatxx", "cat") → 9
*/
public int strDist(String str, String sub) {
  if (str.indexOf(sub) == -1)
    return 0;
  int firstIndex = str.indexOf(sub);
  int finalPos = str.lastIndexOf(sub) + sub.length();
  return finalPos - firstIndex;
}
