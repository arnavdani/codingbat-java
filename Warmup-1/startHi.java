/* Given a string, return true if the string starts with "hi" and false otherwise.

   startHi("hi there") → true
   startHi("hi") → true
   startHi("hello hi") → false
   
   https://codingbat.com/prob/p191022
*/
public boolean startHi(String str) {
   if (str.length() < 2)
   {
      return false; 
   }
  String s2 = str.substring(0,2);
   
   if (s2.equals("hi"))
    {
      return true;
    }
    return false;
}
