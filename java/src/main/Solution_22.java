import java.util.ArrayList;
import java.util.List;

public class Solution_22 {
  //express it as a sum of disjoint set: example : (left)right
  public List<String> generateParenthesis(int n) {
    List<String> ans = new ArrayList<>();
    if (n == 0)
      ans.add("");
    else {
      for (int c = 0; c < n; c++) {
        for (String left : generateParenthesis(c))
          for (String right : generateParenthesis(n - c - 1))
            ans.add("(" + left + ")" + right);
      }
    }
    return ans;
  }

  //only add those valid sequence
  public List<String> generateParenthesisBacktracking(int n) {
    List<String> res = new ArrayList<>();
    backtrace("", 0, 0, res, n);
    return res;
  }

  private void backtrace(String current, int leftCount, int rightCount, List<String> res, int max) {
    if (current.length() == max * 2) {
      res.add(current);
    } else {
      if (leftCount < max)
        backtrace(current + "(", leftCount + 1, rightCount, res, max);
      if (leftCount > rightCount)
        backtrace(current + ")", leftCount, rightCount + 1, res, max);
    }
  }

  public List<String> generateParenthesisBrute(int n) {
    List<String> res = new ArrayList<>();
    generateAll(new char[n * 2], 0, res);
    return res;
  }

  private void generateAll(char[] current, int pos, List<String> res) {
    if (pos == current.length) {
      if (vaild(current))
        res.add(String.valueOf(current));
    } else {
      current[pos] = '(';
      generateAll(current, pos + 1, res);
      current[pos] = ')';
      generateAll(current, pos + 1, res);
    }
  }

  private boolean vaild(char[] current) {
    int count = 0;
    for (char c : current) {
      if (c == '(')
        count++;
      else if (c == ')' && count > 0) {
        count--;
      } else {
        return false;
      }
    }
    return count == 0;
  }
}
