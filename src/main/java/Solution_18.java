import java.util.*;

import static java.util.stream.Collectors.toList;

public class Solution_18 {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    if (nums.length < 4) {
      return new ArrayList<>();
    }
    Arrays.sort(nums);

    Set<List<Integer>> result = new HashSet<>();
    for (int x = 0; x < nums.length - 3; x++) {
      for (int y = x + 1; y < nums.length - 2; y++) {
        int i = y + 1;
        int j = nums.length - 1;
        while (i < j) {
          int sum3 = nums[y] + nums[i] + nums[j];
          int newTarget = target - nums[x];
          if (sum3 == newTarget) {
            result.add(Arrays.asList(nums[x], nums[y], nums[i], nums[j]));
            i++;
            j--;
          } else if (sum3 < newTarget) {
            while (i < nums.length - 1 && nums[i] == nums[i + 1]) i++;
            i++;
          } else {
            while (j > 0 && nums[j] == nums[j - 1]) j--;
            j--;
          }
        }
      }
    }
    return new ArrayList<>(result);
  }
}
