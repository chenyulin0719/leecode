import java.util.*;

import static java.util.stream.Collectors.toList;

public class Solution_47 {
  public List<List<Integer>> permuteUnique(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();
    permuteUniqueSwap(nums, res, 0);
    return res;
  }

  private void permuteUniqueSwap(int[] nums, List<List<Integer>> res, int start) {
    if (start == nums.length) {
      res.add(Arrays.stream(nums).boxed().collect(toList()));
      return;
    }

    Set<Integer> usedNum = new HashSet<>();
    for (int i = start; i < nums.length; i++) {
      if (usedNum.contains(nums[i]))
        continue;
      usedNum.add(nums[i]);
      swap(nums, start, i);
      permuteUniqueSwap(nums, res, start + 1);
      swap(nums, start, i);
    }
  }

  private void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }
}
