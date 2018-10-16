public class Solution_44 {
  private int[][] recursiveDP;

  public boolean isMatchGreedy(String s, String p) {
    int scur = 0, pcur = 0;
    int sstar = -1, psstar = -1;

    while (scur != s.length()) {
      char nextS = s.charAt(scur);
      if (pcur < p.length() && (nextS == p.charAt(pcur) || p.charAt(pcur) == '?')) {
        scur++;
        pcur++;
      } else if (pcur < p.length() && p.charAt(pcur) == '*') {
        psstar = pcur++;
        sstar = scur;
      } else if (psstar != -1) {
        pcur = psstar + 1;
        scur = ++sstar;
      } else {
        return false;
      }
    }
    while (pcur < p.length() && p.charAt(pcur) == '*')
      pcur++;
    return pcur == p.length();
  }


  public boolean isMatchDP(String s, String p) {
    int m = s.length(), n = p.length();
    boolean[][] dp = new boolean[m + 1][n + 1];
    dp[0][0] = true;
    for (int i = 1; i <= n; i++) {
      if (p.charAt(i - 1) == '*')
        dp[0][i] = dp[0][i - 1];
    }
    for (int i = 1; i <= m; i++) {
      for (int j = 1; j <= n; j++) {
        if (p.charAt(j - 1) == '*') {
          dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
        } else {
          dp[i][j] = (s.charAt(i - 1) == p.charAt(j - 1) || p.charAt(j - 1) == '?') && dp[i - 1][j - 1];
        }
      }
    }
    return dp[m][n];
  }

  //TLE
  public boolean isMatchRecursiveDP(String s, String p) {
    recursiveDP = new int[s.length() + 1][p.length() + 1];
    for (int i = 0; i <= s.length(); i++) {
      recursiveDP[i][p.length()] = -1;
    }
    for (int i = 0; i <= p.length(); i++)
      recursiveDP[s.length()][i] = -1;

    for (int i = p.length() - 1; i >= 0; i--) {
      if (p.charAt(i) == '*') {
        recursiveDP[s.length()][i] = 1;
      } else {
        break;
      }
    }
    recursiveDP[s.length()][p.length()] = 1;
    return isMatchRecursiveDP(s, p, 0, 0);
  }

  private boolean isMatchRecursiveDP(String s, String p, int stringIndex, int patternIndex) {
    if (recursiveDP[stringIndex][patternIndex] != 0)
      return recursiveDP[stringIndex][patternIndex] == 1;

    boolean isMatch;
    char nextPattern = p.charAt(patternIndex);
    if (nextPattern == '*') {
      if (stringIndex == s.length())
        isMatch = isMatchRecursiveDP(s, p, stringIndex, patternIndex + 1);
      else
        isMatch = isMatchRecursiveDP(s, p, stringIndex, patternIndex + 1) || (isMatchRecursiveDP(s, p, stringIndex + 1, patternIndex));
    } else {
      if (nextPattern != '?' && nextPattern != s.charAt(stringIndex)) {
        isMatch = false;
      } else {
        isMatch = isMatchRecursiveDP(s, p, stringIndex + 1, patternIndex + 1);
      }
    }

    recursiveDP[stringIndex][patternIndex] = isMatch ? 1 : -1;
    return isMatch;
  }

  //TLE
  public boolean isMatchRecursive(String s, String p) {
    if (("".equals(s) && "".equals(p)) || "*".equals(p)) {
      return true;
    }
    if (s.length() > 0 && "".equals(p))
      return false;
    //notice s = ""
    char nextPattern = p.charAt(0);
    if (nextPattern == '*') {
      return isMatchRecursive(s, p.substring(1)) || (!"".equals(s) && isMatchRecursive(s.substring(1), p));
    } else {
      if ("".equals(s))
        return false;
      if (nextPattern != '?' && nextPattern != s.charAt(0))
        return false;
      return isMatchRecursive(s.substring(1), p.substring(1));
    }
  }
}
