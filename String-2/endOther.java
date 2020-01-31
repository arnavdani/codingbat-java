/* Given two strings, return true if either of the strings 
   appears at the very end of the other string, ignoring 
   upper/lower case differences (in other words, the computation 
   should not be "case sensitive"). Note: str.toLowerCase() returns 
   the lowercase version of a string.

   endOther("Hiabc", "abc") → true
   endOther("AbC", "HiaBc") → true
   endOther("abc", "abXabc") → true
   
   https://codingbat.com/prob/p126880
*/
public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  boolean test1 = a.length() > b.length() &&
        a.substring(a.length()- b.length()).equals(b);
  
  boolean test2 = b.length() > a.length() &&
        b.substring(b.length() - a.length()).equals(a);
        
  boolean test3 = a.equals(b);
  
  return test1 || test2 || test3;
}
