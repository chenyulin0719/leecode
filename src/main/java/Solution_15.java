import java.util.*;

public class Solution_15 {

  public List<List<Integer>> threeSumTrim(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    for (int k = 0; k < nums.length - 2; k++) {
      if (nums[k] > 0) break;
      if (k > 0 && nums[k - 1] == nums[k]) continue;
      int target = -nums[k];
      int i = k + 1;
      int j = nums.length - 1;
      while (i < j) {
        if (nums[i] + nums[j] == target) {
          result.add(Arrays.asList(nums[k], nums[i], nums[j]));
          while (i < j && nums[i] == nums[i + 1]) i++;
          while (i < j && nums[j] == nums[j - 1]) j--;
          i++;
          j--;
        } else if (nums[i] + nums[j] < target) {
          i++;
        } else {
          j--;
        }
      }
    }
    return result;
  }

  // implement Solution_1，LTE
  public List<List<Integer>> threeSumByTwoSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < nums.length - 2; i++) {
      List<List<Integer>> twoSumResult = twoSum(nums, i + 1, -nums[i]);
      for (List<Integer> twoList : twoSumResult) {
        List<Integer> threeList = new ArrayList<>();
        threeList.add(nums[i]);
        threeList.addAll(twoList);
        if (notDuplicateList(result, threeList)) {
          result.add(threeList);
        }
      }
    }
    return result;
  }

  private List<List<Integer>> twoSum(int[] nums, int startIndex, int target) {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = startIndex; i < nums.length; i++) {
      if (map.containsKey(nums[i])) {
        result.add(Arrays.asList(nums[map.get(nums[i])], nums[i]));
      } else {
        int complement = target - nums[i];
        map.put(complement, i);
      }
    }
    return result;
  }


  //Time out
  public List<List<Integer>> threeSumBrute(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    int len = nums.length;
    if (len >= 3) {
      for (int x = 0; x < len - 2; x++) {
        for (int y = x + 1; y < len - 1; y++) {
          for (int z = y + 1; z < len; z++) {
            if ((nums[x] + nums[y] + nums[z] == 0)) {
              List<Integer> newList = Arrays.asList(nums[x], nums[y], nums[z]);
              if (notDuplicateList(result, newList)) {
                result.add(newList);
              }
            }
          }
        }
      }
    }
    return result;
  }

  private boolean notDuplicateList(List<List<Integer>> result, List<Integer> target) {
    for (List<Integer> list : result) {
      if (list.equals(target)) {
        return false;
      }
    }
    return true;
  }
}
