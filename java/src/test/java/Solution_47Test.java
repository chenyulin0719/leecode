import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_47Test {

  @Test
  public void permuteUnique() {
    Solution_47 instance = new Solution_47();
    int[] input = {1, 1, 2};
    List<List<Integer>> output = new ArrayList();
    output.add(Arrays.asList(1, 1, 2));
    output.add(Arrays.asList(1, 2, 1));
    output.add(Arrays.asList(2, 1, 1));

    assertEquals(output, instance.permuteUnique(input));
  }
}