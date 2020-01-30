/* Given an array of ints, return true if it contains no 1's or it contains no 4's.

   no14([1, 2, 3]) → true
   no14([1, 2, 3, 4]) → false
   no14([2, 3, 4]) → true
   
   https://codingbat.com/prob/p136648
*/

public boolean no14(int[] nums) {
    int ones = 0;
    int fours = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) ones++;
        if (nums[i] == 4) fours++;
    }
    return ones == 0 || fours == 0;
}
