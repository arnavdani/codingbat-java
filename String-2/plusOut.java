/* Given a string and a non-empty word string, return a version of 
   the original String where all chars have been replaced by pluses ("+"), 
   except for appearances of the word string which are preserved unchanged.

   plusOut("12xy34", "xy") → "++xy++"
   plusOut("12xy34", "1") → "1+++++"
   plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
*/
public String plusOut(String str, String word) {
    int start = 0;
    int end = str.indexOf(word);
    while (end != -1) {
        for (int i = start; i < end; i++)
            str = str.substring(0,i) + "+" + str.substring(i+1);
        start = end + word.length();
        end = str.indexOf(word, start);
    }
    for (int i = start; i < str.length(); i++)
        str = str.substring(0,i) + "+" + str.substring(i+1);
    return str;
}
