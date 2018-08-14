import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
方法2跟3利用 Map + 補數 Index, 得到 O(n) 複雜度解法。
 */

public class Solution_1 implements Solution {

  public void solve() {
    int[] ums = {2, 7, 11, 15};
    int target = 9;
    int[] results1 = twoSum1(ums, target);
    print(results1);

    int[] results2 = twoSum2(ums, target);
    print(results2);

    int[] results3 = twoSum3(ums, target);
    print(results3);
  }

  // O(n^2)
  private int[] twoSum1(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          int[] results = {i, j};
          return results;
        }
      }
    }

    return null;
  }

  //O(n)
  private int[] twoSum2(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      map.put(nums[i], i);
    }

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        int[] results = {i, map.get(complement)};
        return results;
      }
    }

    return null;
  }

  private int[] twoSum3(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (map.containsKey(complement)) {
        int[] results = {i, map.get(complement)};
        return results;
      }
      map.put(nums[i], i);
    }

    return null;
  }

  public void print(int[] results) {
    System.out.println("Result");
    if (results != null) {
      Arrays.stream(results).forEach(result -> System.out.println(result));
    } else {
      System.out.println("No result matched.");
    }
  }

}
