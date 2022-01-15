public class Solution_4 {

  //不會，看解答
  //The overall run time complexity should be O(log (m+n)).
  //中位數是將一個串列切割成兩個集合，其中一個集合的元素皆大於另一個集合
  public double findMedianSortedArrays(int[] nums1, int[] nums2) {

    int n1 = nums1.length;
    int n2 = nums2.length;

    if (n1 > n2) {  //讓 num2 比 num1長
      return findMedianSortedArrays(nums2, nums1);
    }

    if (n2 == 0) {
      throw new IllegalArgumentException("Must have 1 number.");
    }

    //m1+m2 = k
    //目的為找到k個數字
    int k = (n1 + n2 + 1) / 2;
    int l = 0; // 代表前幾個必包含
    int r = n1; // 搜尋邊界

    while (l < r) {
      int m1 = (l + r) / 2; //Binary search，在 l 和 r 之間取中間值，l 和 r 代表 m1 的可能範圍
      int m2 = k - m1;

      if (nums1[m1] < nums2[m2 - 1]) { //m1 和 m1 左邊的都該選起來
        l = m1 + 1;
      } else {  // m1 右邊的不選了。
        r = m1;
      }
    }

    int m1 = l;
    int m2 = k - l;

    int c1 = Math.max((m1 == 0) ? Integer.MIN_VALUE : nums1[m1 - 1],
            (m2 == 0) ? Integer.MIN_VALUE : nums2[m2 - 1]);
    int c2 = Math.min((m1 == n1 ? Integer.MAX_VALUE : nums1[m1]),
            (m2 == n2 ? Integer.MAX_VALUE : nums2[m2]));

    return ((n1 + n2) % 2 == 0) ? (c1 + c2) / 2.0 : c1;

  }
}