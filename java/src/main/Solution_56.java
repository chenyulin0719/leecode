import Utils.Interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution_56 {
  //O(nlogn)
  public List<Interval> merge(List<Interval> intervals) {
    List<Interval> result = new ArrayList<>();
    if (intervals == null || intervals.size() == 0)
      return result;

    intervals.sort(Comparator.comparingInt(v -> v.start));
    Interval pre_iv = intervals.get(0);
    for (int i = 1; i < intervals.size(); i++) {
      Interval next_iv = intervals.get(i);
      if (pre_iv.end < next_iv.start) {
        result.add(pre_iv);
        pre_iv = next_iv;
      } else {
        pre_iv.end = Math.max(pre_iv.end, next_iv.end);
      }
    }
    result.add(pre_iv);
    return result;
  }

  public List<Interval> mergeByInsert(List<Interval> intervals) {
    List<Interval> result = new ArrayList<>();
    if (intervals == null || intervals.size() == 0)
      return result;
    for (Interval interval : intervals) {
      result = insert(result, interval);
    }
    return result;
  }

  private List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new ArrayList<>();
    int pos = 0;
    for (Interval interval : intervals) {
      if (interval.end < newInterval.start) {
        result.add(interval);
        pos++;
      } else if (interval.start > newInterval.end) {
        result.add(interval);
      } else {
        newInterval.start = Math.min(newInterval.start, interval.start);
        newInterval.end = Math.max(newInterval.end, interval.end);
      }
    }
    result.add(pos, newInterval);
    return result;
  }
}