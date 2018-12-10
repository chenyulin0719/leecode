public class Solution_72 {
  public int minDistanceDP(String word1, String word2) {
    if (word1.length() == 0) return word2.length();
    if (word2.length() == 0) return word1.length();

    int dp[][] = new int[word1.length() + 1][word2.length() + 1];
    for (int i = 0; i < word1.length(); i++)
      dp[i][word2.length()] = word1.length() - i;
    for (int i = 0; i < word2.length(); i++)
      dp[word1.length()][i] = word2.length() - i;

    for (int x = word1.length() - 1; x >= 0; x--) {
      for (int y = word2.length() - 1; y >= 0; y--) {
        //remove、insert
        int min = 1 + Math.min(dp[x + 1][y], dp[x][y + 1]);
        //replace
        min = Math.min(1 + dp[x + 1][y + 1], min);
        //matched
        if (word1.charAt(x) == word2.charAt(y))
          min = Math.min(min, dp[x + 1][y + 1]);
        dp[x][y] = min;
      }
    }
    return dp[0][0];
  }

  //  TLE
  public int minDistanceRecursive(String word1, String word2) {
    if (word1.length() == 0) return word2.length();
    if (word2.length() == 0) return word1.length();

    int remove = 1 + minDistanceRecursive(word1.substring(1), word2);
    int insert = 1 + minDistanceRecursive(word1, word2.substring(1));
    int replace = 1 + minDistanceRecursive(word1.substring(1), word2.substring(1));
    int match = word1.charAt(0) == word2.charAt(0) ? minDistanceRecursive(word1.substring(1), word2.substring(1)) : Integer.MAX_VALUE;
    return Math.min(remove, Math.min(insert, Math.min(replace, match)));
  }
}