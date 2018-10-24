import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_49Test {

  @Test
  public void groupAnagrams() {
    Solution_49 instance = new Solution_49();
    String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> expect = new ArrayList<>();
    expect.add(Arrays.asList("eat", "tea", "ate"));
    expect.add(Arrays.asList("bat"));
    expect.add(Arrays.asList("tan", "nat"));

    assertEquals(expect, instance.groupAnagrams(input));
  }
}