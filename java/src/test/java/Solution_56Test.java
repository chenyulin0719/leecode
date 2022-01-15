import Utils.Interval;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Solution_56Test {

  @Test
  public void merge() {
    Solution_56 instance = new Solution_56();

    List<Interval> input1 = new ArrayList<>();
    List<Interval> expect1 = new ArrayList<>();
    input1.add(new Interval(1, 3));

    input1.add(new Interval(15, 18));
    input1.add(new Interval(2, 6));
    input1.add(new Interval(8, 10));
    expect1.add(new Interval(1, 6));
    expect1.add(new Interval(8, 10));
    expect1.add(new Interval(15, 18));
    assertEquals(expect1, instance.merge(input1));

    List<Interval> input2 = new ArrayList<>();
    List<Interval> expect2 = new ArrayList<>();
    input2.add(new Interval(1, 4));
    input2.add(new Interval(4, 5));
    expect2.add(new Interval(1, 5));
    assertEquals(expect2, instance.merge(input2));
  }

  @Test
  public void mergeByInsert() {
    Solution_56 instance = new Solution_56();

    List<Interval> input1 = new ArrayList<>();
    List<Interval> expect1 = new ArrayList<>();
    input1.add(new Interval(1, 3));
    input1.add(new Interval(15, 18));
    input1.add(new Interval(2, 6));
    input1.add(new Interval(8, 10));
    expect1.add(new Interval(1, 6));
    expect1.add(new Interval(8, 10));
    expect1.add(new Interval(15, 18));
    assertEquals(expect1, instance.mergeByInsert(input1));

    List<Interval> input2 = new ArrayList<>();
    List<Interval> expect2 = new ArrayList<>();
    input2.add(new Interval(1, 4));
    input2.add(new Interval(4, 5));
    expect2.add(new Interval(1, 5));
    assertEquals(expect2, instance.mergeByInsert(input2));
  }
}