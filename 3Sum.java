public class Solution {
    /*
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
       List<List<Integer>> result = new ArrayList<List<Integer>>();
       if ((numbers == null) || (numbers.length < 3)) {
           return result;
       }
       Arrays.sort(numbers);
       for (int i = 0; i < numbers.length - 2; i++) {
           if ((i > 0) && (numbers[i] == numbers[i-1])) {
               continue;
           }
           int left = i + 1;
           int right = numbers.length - 1;
           int target = -numbers[i];
           System.out.println(target);
           twoSum(left, right, target, result, numbers);
       }
       return result;
    }
    
    public void twoSum(int left, int right, int target, List<List<Integer>> result, int[] numbers) {
        while (left < right) {
            if ((numbers[left] + numbers[right]) == target) {
                List<Integer> triplet = new ArrayList<Integer>();
                triplet.add(-target);
                triplet.add(numbers[left]);
                triplet.add(numbers[right]);
                result.add(triplet);
                left++;
                right--;
                
                while ((left < right) && (numbers[left] == numbers[left - 1])) {
                    left++;
                }
                while ((left < right) && (numbers[right] == numbers[right + 1])) {
                    right--;
                }
            }
            if ((numbers[left] + numbers[right]) < target) {
                left++;
            }
            if ((numbers[left] + numbers[right]) > target) {
                right--;
            }
        }
    }
}