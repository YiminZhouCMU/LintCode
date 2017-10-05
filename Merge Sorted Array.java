public class Solution {
    /*
     * @param A: sorted integer array A which has m elements, but size of A is m+n
     * @param m: An integer
     * @param B: sorted integer array B which has n elements
     * @param n: An integer
     * @return: nothing
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        int indexAO = m - 1;
        int indexBO = n - 1;
        int indexA = m + n - 1;
        int max = Math.min(m, n);
        while ((indexAO >= 0) && (indexBO >= 0)) {
            if (A[indexAO] > B[indexBO]) {
                A[indexA] = A[indexAO];
                indexAO--;
            } else {
                A[indexA] = B[indexBO];
                indexBO--;
            }
            indexA--;
        }
        while (indexAO >= 0) {
            A[indexA] = A[indexAO];
            indexAO--;
            indexA--;
        }
        while (indexBO >= 0) {
            A[indexA] = B[indexBO];
            indexBO--;
            indexA--;
        }
    }
}