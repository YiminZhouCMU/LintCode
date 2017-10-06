public class Solution {
    /*
     * @param A: A list of integers
     * @param elem: An integer
     * @return: The new length after remove
     */
    public int removeElement(int[] A, int elem) {
        if ((A == null) || (A.length == 0)) {
            return 0;
        }
        int indexNew = 0;
        for (int indexOld = 0; indexOld < A.length; indexOld++) {
            if (A[indexOld] != elem) {
                A[indexNew] = A[indexOld];
                indexNew++;
            }
        }
        return indexNew;
    }
}