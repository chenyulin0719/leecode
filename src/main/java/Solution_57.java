import Utils.Interval;

import java.util.ArrayList;
import java.util.List;

public class Solution_57 {
  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> result = new ArrayList<>();
    int pos = 0;
    for (Interval interval : intervals) {
      if (interval.end < newInterval.start) {
        pos++;
        result.add(interval);
      } else if (interval.start > newInterval.end) {
        result.add(interval);
      } else {
        newInterval.start = Math.min(interval.start, newInterval.start);
        newInterval.end = Math.max(interval.end, newInterval.end);
      }
    }
    result.add(pos, newInterval);
    return result;
  }
}