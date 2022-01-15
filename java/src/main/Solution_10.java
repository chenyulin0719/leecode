public class Solution_10 {
  enum Result {
    TRUE, FALSE
  }

  private Result[][] memo;

  public boolean isMatchDP_BottomUp(String s, String p) {
    boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
    dp[s.length()][p.length()] = true;

    for (int i = s.length(); i >= 0; i--) {
      for (int j = p.length() - 1; j >= 0; j--) {
        boolean firstMatch = (i < s.length()) &&
                (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
        if (j < p.length() - 1 && p.charAt(j + 1) == '*') {
          dp[i][j] = dp[i][j + 2] || (firstMatch && dp[i + 1][j]);
        } else {
          dp[i][j] = firstMatch && dp[i + 1][j + 1];
        }
      }
    }

    return dp[0][0];
  }

  private boolean dpBottomUp(String s, String p, int i, int j) {
    return false;
  }


  public boolean isMatchDP_TopDown(String s, String p) {
    memo = new Result[s.length() + 1][p.length() + 1];
    return dpTopDown(s, p, 0, 0);
  }

  private boolean dpTopDown(String s, String p, int i, int j) {
//    System.out.println("s,p:" + s + "," + p);
//    System.out.println("i" + i);
//    System.out.println("j" + j);
    if (memo[i][j] != null) {
      return memo[i][j] == Result.TRUE;
    }

    boolean ans;
    if (j == p.length()) {
      ans = i == s.length();
    } else {
      boolean firstMatch = i < s.length() &&
              ((s.charAt(i) == p.charAt(j)) ||
                      (p.charAt(j) == '.'));

      if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
        ans = dpTopDown(s, p, i, j + 2) ||
                (firstMatch && dpTopDown(s, p, i + 1, j));
      } else {
        ans = firstMatch && dpTopDown(s, p, i + 1, j + 1);
      }
    }
    memo[i][j] = ans ? Result.TRUE : Result.FALSE;
    return ans;
  }


  //recursive,time out
  public boolean isMatchRecursive(String s, String p) {
    if (s.isEmpty()) {
      return p.isEmpty() || p.length() >= 2 && p.substring(1, 2).equals("*") && isMatchRecursive(s, p.substring(2));
    }

    if (p.isEmpty()) {
      return false;
    }

    boolean firstMatch = (s.charAt(0) == p.charAt(0)) || (p.charAt(0) == '.');

    if (p.length() >= 2 &&
            p.charAt(1) == '*') {
      if (firstMatch) {
        return isMatchRecursive(s.substring(1), p) || isMatchRecursive(s, p.substring(2));
      } else {
        return isMatchRecursive(s, p.substring(2));
      }
    } else {
      return firstMatch && isMatchRecursive(s.substring(1), p.substring(1));
    }
  }
}
