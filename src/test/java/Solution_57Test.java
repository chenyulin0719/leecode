import Utils.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_57Test {

  @Test
  public void insert() {
    Solution_57 instance = new Solution_57();

    List<Interval> input1 = new ArrayList<>();
    List<Interval> expect1 = new ArrayList<>();
    Interval newInterval1 = new Interval(2, 5);
    input1.add(new Interval(1, 3));
    input1.add(new Interval(6, 9));
    expect1.add(new Interval(1, 5));
    expect1.add(new Interval(6, 9));
    assertEquals(expect1, instance.insert(input1, newInterval1));

    List<Interval> input2 = new ArrayList<>();
    List<Interval> expect2 = new ArrayList<>();
    Interval newInterval2 = new Interval(4, 8);
    input2.add(new Interval(1, 2));
    input2.add(new Interval(3, 5));
    input2.add(new Interval(6, 7));
    input2.add(new Interval(8, 10));
    input2.add(new Interval(12, 16));
    expect2.add(new Interval(1, 2));
    expect2.add(new Interval(3, 10));
    expect2.add(new Interval(12, 16));
    assertEquals(expect2, instance.insert(input2, newInterval2));
  }
}