/* Given a string, compute recursively (no loops) a new string 
   where all the lowercase 'x' chars have been changed to 'y' chars.

   changeXY("codex") → "codey"
   changeXY("xxhixx") → "yyhiyy"
   changeXY("xhixhix") → "yhiyhiy"
*/
public String changeXY(String str) {
  if (str.indexOf("x") == -1)
    return str;
  
  int index = str.indexOf("x");
  String first = str.substring(0, index) + "y";
  String second = str.substring(index + 1);
  return first + changeXY(second);
}
