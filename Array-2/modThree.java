/* Given an array of ints, return true if the array contains 
   either 3 even or 3 odd values all next to each other.

   modThree([2, 1, 3, 5]) → true
   modThree([2, 1, 2, 5]) → false
   modThree([2, 4, 2, 5]) → true
   
   https://codingbat.com/prob/p159979
*/
public boolean modThree(int[] nums) {
    for (int i = 0; i <= nums.length - 3; i++) {
        boolean cond1 = nums[i] % 2 == 0 && nums[i + 1] % 2 == 0
                && nums[i + 2] % 2 == 0;
        boolean cond2 = nums[i] % 2 == 1 && nums[i + 1] % 2 == 1
                && nums[i + 2] % 2 == 1;
        if (cond1 || cond2) return true;
    }
    return false;
}
