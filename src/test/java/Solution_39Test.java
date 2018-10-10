import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_39Test {
  private int[] candidates1 = {2, 3, 6, 7};
  private int[] candidates2 = {2, 3, 5};
  private int target1 = 7;
  private int target2 = 8;
  List<List<Integer>> expect1;
  List<List<Integer>> expect2;

  public Solution_39Test() {
    expect1 = new ArrayList<>();
    expect1.add(Arrays.asList(2, 2, 3));
    expect1.add(Arrays.asList(7));

    expect2 = new ArrayList<>();
    expect2.add(Arrays.asList(2, 2, 2, 2));
    expect2.add(Arrays.asList(2, 3, 3));
    expect2.add(Arrays.asList(3, 5));
  }

  @Test
  public void combinationSumDFS() {
    Solution_39 instance = new Solution_39();

    assertEquals(expect1, instance.combinationSumDFS(candidates1, target1));
    assertEquals(expect2, instance.combinationSumDFS(candidates2, target2));
  }

  @Test
  public void combinationSumRecursive() {
    Solution_39 instance = new Solution_39();

    assertEquals(expect1, instance.combinationSumRecursive(candidates1, target1));
    assertEquals(expect2, instance.combinationSumRecursive(candidates2, target2));
  }
}