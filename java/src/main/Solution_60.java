import java.util.ArrayList;
import java.util.List;

public class Solution_60 {
  public String getPermutation(int n, int k) {

    int[] factorial = new int[n];
    int[] index = new int[n];
    factorial[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--)
      factorial[i] = (n - 1 - i) * factorial[i + 1];

    index[n - 1] = 0;
    for (int i = 0; i < n - 1; i++) {
      index[i] = (k - 1) / factorial[i];
      k = (k - 1) % factorial[i] + 1;
    }

    List<Integer> tempList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= n; i++) {
      tempList.add(i);
    }

    for (int i = 0; i < n; i++) {
      sb.append(tempList.remove(index[i]));
    }
    return sb.toString();
  }
}
