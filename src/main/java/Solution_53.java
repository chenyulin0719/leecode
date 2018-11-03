public class Solution_53 {
  //O(nlogn)
  public int maxSubArrayDivideAndConquer(int[] nums) {
    return maxSubArrayDivideAndConquer(nums, 0, nums.length - 1);
  }

  private int maxSubArrayDivideAndConquer(int[] nums, int start, int end) {
    if (start == end)
      return nums[start];
    int middle = start + (end - start) / 2;
    int leftMSA = maxSubArrayDivideAndConquer(nums, start, middle);
    int rightMSA = maxSubArrayDivideAndConquer(nums, middle + 1, end);

    int leftMax = Integer.MIN_VALUE, rightMax = Integer.MIN_VALUE, sum = 0;
    for (int i = middle; i >= start; i--) {
      sum += nums[i];
      leftMax = Math.max(leftMax, sum);
    }
    sum = 0;
    for (int i = middle + 1; i <= end; i++) {
      sum += nums[i];
      rightMax = Math.max(rightMax, sum);
    }

    int max = Math.max(leftMSA, rightMSA);
    max = Math.max(max, leftMax + rightMax);
    return max;
  }

  //O(n)
  public int maxSubArray(int[] nums) {
    long sum = Integer.MIN_VALUE, max = Integer.MIN_VALUE;
    for (int num : nums) {
      sum = Math.max(sum + num, num);
      max = Math.max(max, sum);
    }
    return (int) max;
  }
}