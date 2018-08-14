public class Solution_4 implements Solution {
    @Override
    public void solve() {
        System.out.println("Median of Two Sorted Arrays,:");

        System.out.println("Test 1:");
        int[] nums1 = {3, 4, 5, 6};
        int[] nums2 = {1, 2, 7, 8};
        assert findMedianSortedArrays(nums1, nums2) == 4.5;

        System.out.println("Test 2:");
        int[] nums3 = {1, 3, 5, 7, 9};
        int[] nums4 = {2, 4, 6, 8};
        assert findMedianSortedArrays(nums3, nums4) == 5.0;
    }


    //不會，看解答
    //The overall run time complexity should be O(log (m+n)).
    //中位數是將一個串列切割成兩個集合，其中一個集合的元素皆大於另一個集合
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //要利用已經sort好的特性
        //第一個Array 數量 > 第二個Array

        int[] A = nums1, B = nums2;

        if (A.length < B.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }

        int m = A.length;
        int n = B.length;

        int iMin = 0;
        int iMax = A.length;
        int halfLength = (m + n + 1) / 2;

        while (iMin <= iMax) {
            int i = (iMin + iMax) / 2;
            int j = halfLength - i;

            System.out.println("iMin=" + iMin + ",iMax=" + iMax + ",halfLength=" + halfLength);
            System.out.println("i=" + i + "A[i] = " + A[i]+ ", B[j ] = " + B[j]);

            if (i < iMax && A[i] < B[j - 1]) {
                System.out.println("CASE 1.");
                iMin = iMin + 1;   //iMin+1 可想為右集合
            } else if (i > iMin && A[i - 1] > B[j]) {
                System.out.println("CASE 2.");
                iMax = iMax - 1;
            } else {
                System.out.println("CASE 3.");
                int maxLeft = 0;
                if (i == 0) {
                    maxLeft = B[j - 1];
                } else if (j == 0) {
                    maxLeft = A[i - 1];
                } else {
                    maxLeft = Math.max(A[i - 1], B[j - 1]);
                }

                int minRight = 0;
                if (i == m) {
                    minRight = B[j];
                } else if (j == n) {
                    minRight = A[i];
                } else {
                    minRight = Math.min(A[i], B[j]);
                }

                System.out.println("maxLeft=" + maxLeft + ",minRight=" + minRight);

                return (maxLeft + minRight) / 2.0;

            }
            System.out.println();
        }

        return 0.0;
    }
//    public double findMedianSortedArrays(int[] A, int[] B) {
//    int m = A.length;ㄏ
//    int n = B.lengh;
//        if (m > n) { // to ensure m<=n
//        int[] temp = A; A = B; B = temp;
//        int tmp = m; m = n; n = tmp;
//    }
//    int iMin = 0, iMax = m, halfLen = (m + n + 1) / 2;
//        while (iMin <= iMax) {
//        int i = (iMin + iMax) / 2;
//        int j = halfLen - i;
//        if (i < iMax && B[j-1] > A[i]){
//            iMin = iMin + 1; // i is too small
//        }
//        else if (i > iMin && A[i-1] > B[j]) {
//            iMax = iMax - 1; // i is too big
//        }
//        else { // i is perfect
//            int maxLeft = 0;
//            if (i == 0) { maxLeft = B[j-1]; }
//            else if (j == 0) { maxLeft = A[i-1]; }
//            else { maxLeft = Math.max(A[i-1], B[j-1]); }
//            if ( (m + n) % 2 == 1 ) { return maxLeft; }
//
//            int minRight = 0;
//            if (i == m) { minRight = B[j]; }
//            else if (j == n) { minRight = A[i]; }
//            else { minRight = Math.min(B[j], A[i]); }
//
//            return (maxLeft + minRight) / 2.0;
//        }
//    }
//        return 0.0;
//}


}