package Utils;

public class Interval {
  public int start;
  public int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }

  public boolean equals(Object target) {
    if (target instanceof Interval) {
      Interval i = (Interval) target;
      return (start == i.start) && (end == i.end);
    }
    return false;
  }

  public String toString() {
    return "(" + start + "," + end + ")";
  }
}