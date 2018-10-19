import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_46Test {

  @Test
  public void permute() {
    Solution_46 instance = new Solution_46();
    int[] input = {1, 2, 3};
    List<List<Integer>> output = new ArrayList();
    output.add(Arrays.asList(1, 2, 3));
    output.add(Arrays.asList(1, 3, 2));
    output.add(Arrays.asList(2, 1, 3));
    output.add(Arrays.asList(2, 3, 1));
    output.add(Arrays.asList(3, 1, 2));
    output.add(Arrays.asList(3, 2, 1));

    assertEquals(output, instance.permute(input));
  }
}