public class Solution_11 {
  //兩條線的高度一定是由較短的決定
  //將較短的一遍往內縮
  public int maxArea(int[] height) {
    int i = 0, j = height.length - 1;
    int maxArea = 0;
    while (i < j) {
      int vol = Math.min(height[i], height[j]) * (j - i);
      maxArea = Math.max(maxArea, vol);
      if (height[i] < height[j]) {
        i++;
      } else {
        j--;
      }
    }
    return maxArea;
  }
}
