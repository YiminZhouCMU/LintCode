public class Solution {
    /*
     * @param nums: An ineger array
     * @return: An integer
     */
    public int removeDuplicates(int[] nums) {
        if ((nums == null) || (nums.length == 0)) {
            return 0;
        }
        int size = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[size] != nums[i]) {
                size = size + 1;
                nums[size] = nums[i];
            }
        }
        return size + 1;
    }
}