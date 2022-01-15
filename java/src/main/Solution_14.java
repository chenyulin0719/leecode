public class Solution_14 {

  public String longestCommonPrefixBinarySearch(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    int minLen = Integer.MAX_VALUE;
    for (String str : strs) {
      minLen = str.length() < minLen ? str.length() : minLen;
    }

    int low = 1;
    int high = minLen;
    while (low <= high) {
      System.out.println("low,high:" + low + "," + high);
      int middle = (low + high) / 2;
      if (isCommonPredix(strs, middle)) {
        low = middle + 1;
      } else {
        high = middle - 1;
      }
    }
    System.out.println("low,high:" + low + "," + high);
    return strs[0].substring(0, (low + high) / 2);
  }

  private boolean isCommonPredix(String[] strs, int len) {
    String str1 = strs[0].substring(0, len);
    for (String str : strs) {
      if (!str.startsWith(str1)) {
        return false;
      }
    }
    return true;
  }

  public String longestCommonPrefixDivideAndConquer(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }
    return longestCommonPrefixDivideAndConquer(strs, 0, strs.length - 1);
  }

  private String longestCommonPrefixDivideAndConquer(String[] strs, int l, int r) {
    if (l == r) {
      return strs[l];
    }
    int mid = (l + r) / 2;
    String leftLCP = longestCommonPrefixDivideAndConquer(strs, l, mid);
    String rightLCP = longestCommonPrefixDivideAndConquer(strs, mid + 1, r);
    return commonPrefix(leftLCP, rightLCP);
  }

  private String commonPrefix(String left, String right) {
    int minLength = Math.min(left.length(), right.length());
    for (int i = 0; i < minLength; i++) {
      if (left.charAt(i) != right.charAt(i)) {
        return left.substring(0, i);
      }
    }
    return left.substring(0, minLength);
  }

  public String longestCommonPrefixVertical(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    for (int i = 0; i < strs[0].length(); i++) {
      char c = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i == strs[j].length() || strs[j].charAt(i) != c) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }

  //LCP(A,LCP(B,C))
  public String longestCommonPrefixHorizontal(String[] strs) {
    if (strs == null || strs.length == 0) {
      return "";
    }

    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) {
        prefix = prefix.substring(0, prefix.length() - 1);
      }
    }
    return prefix;
  }
}
