import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_40Test {

  @Test
  public void combinationSum2() {
    Solution_40 instance = new Solution_40();
    int[] input1 = {10, 1, 2, 7, 6, 1, 5};
    int target1 = 8;
    List<List<Integer>> expect1 = new ArrayList<>();
    expect1.add(Arrays.asList(1, 7));
    expect1.add(Arrays.asList(1, 2, 5));
    expect1.add(Arrays.asList(2, 6));
    expect1.add(Arrays.asList(1, 1, 6));

    assertTrue(equalResult(expect1, instance.combinationSum2(input1, target1)));

    int[] input2 = {2, 5, 2, 1, 2};
    int target2 = 5;
    List<List<Integer>> expect2 = new ArrayList<>();
    expect2.add(Arrays.asList(1, 2, 2));
    expect2.add(Arrays.asList(5));

    assertTrue(equalResult(expect2, instance.combinationSum2(input2, target2)));
  }

  private boolean equalResult(List<List<Integer>> input, List<List<Integer>> expect) {
    if (input.size() != expect.size())
      return false;
    for (List<Integer> temp : input)
      Collections.sort(temp);
    for (List<Integer> temp : expect)
      Collections.sort(temp);
    for (List<Integer> sourceList : input) {
      for (int i = 0; i < expect.size(); i++) {
        List<Integer> targetList = expect.get(i);
        if (sourceList.equals(targetList)) {
          expect.remove(targetList);
          break;
        } else if (i == expect.size() - 1) {
          return false;
        }
      }
    }
    return expect.size() == 0;
  }
}