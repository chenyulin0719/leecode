import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
方法2跟3利用 Map + 補數 Index, 得到 O(n) 複雜度解法。
 */

public class Solution_1 {
  // O(n^2)
  public int[] twoSumBully(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i, j};
        }
      }
    }

    return null;
  }

  //O(n)
  public int[] twoSumHashMap(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{i, map.get(complement)};
      }
    }
    return null;
  }

  //O(n)
  public int[] twoSumHashMapAndComplement(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        return new int[]{map.get(complement), i};
      }
      map.put(nums[i], i);
    }
    return null;
  }
}
