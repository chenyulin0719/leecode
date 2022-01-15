import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Solution_66Test {

  @Test
  public void plusOne() {
    Solution_66 instance = new Solution_66();
    int[] input1 = {1, 2, 3};
    int[] expect1 = {1, 2, 4};
    int[] input2 = {4, 3, 2, 1};
    int[] expect2 = {4, 3, 2, 2};
    int[] input3 = {9, 9, 9};
    int[] expect3 = {1, 0, 0, 0};

    assertArrayEquals(expect1, instance.plusOne(input1));
    assertArrayEquals(expect2, instance.plusOne(input2));
    assertArrayEquals(expect3, instance.plusOne(input3));
  }
}