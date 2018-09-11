import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Solution_15Test {

  @Test
  public void threeSumTrim() {
    Solution_15 instance = new Solution_15();
    int[] input = {-1, 0, 1, 2, -1, -4};
    List<Integer> list1 = Arrays.asList(-1, 0, 1);
    List<Integer> list2 = Arrays.asList(-1, -1, 2);
    List<List<Integer>> expect = Arrays.asList(list1, list2);
    assertTrue(isEqualsResult(expect, instance.threeSumTrim(input)));
  }

  @Test
  public void threeSumByTwoSum() {
    Solution_15 instance = new Solution_15();
    int[] input = {-1, 0, 1, 2, -1, -4};
    List<Integer> list1 = Arrays.asList(-1, 0, 1);
    List<Integer> list2 = Arrays.asList(-1, -1, 2);
    List<List<Integer>> expect = Arrays.asList(list1, list2);
    assertTrue(isEqualsResult(expect, instance.threeSumByTwoSum(input)));
  }

  @Test
  public void threeSumBrute() {
    Solution_15 instance = new Solution_15();
    int[] input = {-1, 0, 1, 2, -1, -4};
    List<Integer> list1 = Arrays.asList(-1, 0, 1);
    List<Integer> list2 = Arrays.asList(-1, -1, 2);
    List<List<Integer>> expect = Arrays.asList(list1, list2);
    assertTrue(isEqualsResult(expect, instance.threeSumBrute(input)));
  }

  private boolean isEqualsResult(List<List<Integer>> source, List<List<Integer>> target) {
    if (source.size() != target.size()) {
      return false;
    }
    List<List<Integer>> copySource = new ArrayList<>(source);
    List<List<Integer>> copyTarget = new ArrayList<>(target);
    for (List<Integer> sourceList : copySource) {
      if (copyTarget.contains(sourceList)) {
        copyTarget.remove(sourceList);
      } else {
        return false;
      }
    }
    return true;
  }

}