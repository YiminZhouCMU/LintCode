public class Solution {
    /*
     * @param A: an integer array
     * @return: 
     */
    public void sortIntegers2(int[] A) {
        mergeSort(A);
    }
        
    private void mergeSort(int[] A) {
        if ((A == null) || (A.length == 0)) {
            return;
        }
        if (A.length <= 1) {
            return;
        }
        int mid = (A.length) / 2;
        int[] leftPart = new int[mid];
        int[] rightPart = new int[A.length - mid];
        
        System.arraycopy(A, 0, leftPart, 0, mid);
        System.arraycopy(A, mid, rightPart, 0, A.length - mid);
        
        mergeSort(leftPart);
        mergeSort(rightPart);
        
        merge(leftPart, rightPart, A);
    }
    
    private void merge(int[] A, int[] B, int[] result) {
        int aIndex = 0;
        int bIndex = 0;
        int rIndex = 0;
        while ((aIndex < A.length) && (bIndex < B.length)) {
            if (A[aIndex] <= B[bIndex]) {
                result[rIndex] = A[aIndex];
                aIndex++;
            } else {
                result[rIndex] = B[bIndex];
                bIndex++;
            }
            rIndex++;
        }
        while (aIndex < A.length) {
            result[rIndex] = A[aIndex];
            aIndex++;
            rIndex++;
        }
        while (bIndex < B.length) {
            result[rIndex] = B[bIndex];
            bIndex++;
            rIndex++;
        }
    }
    
}