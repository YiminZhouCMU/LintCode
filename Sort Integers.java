public class Solution {
    /*
     * @param A: an integer array
     * @return:no return
     */
    public void sortIntegers(int[] array) {
        // write your code here
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]){
                    int tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }
    }
}