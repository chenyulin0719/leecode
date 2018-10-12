import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution_40 {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> current = new ArrayList<>();
    Arrays.sort(candidates);
    combinationSum2DFS(candidates, res, current, candidates.length - 1, target);
    return res;
  }

  private void combinationSum2DFS(int[] candidates, List<List<Integer>> res, List<Integer> current, int tail, int target) {
    for (int i = tail; i >= 0; i--) {
      if (target == candidates[i]) {
        current.add(candidates[i]);
        res.add(new ArrayList<>(current));
        current.remove(current.size() - 1);
        while (i - 1 >= 0 && candidates[i - 1] == candidates[i])
          i--;
        continue;
      }
      if (target > candidates[i]) {
        current.add(candidates[i]);
        combinationSum2DFS(candidates, res, current, i - 1, target - candidates[i]);
        current.remove(current.size() - 1);
      }
      while (i - 1 >= 0 && candidates[i - 1] == candidates[i])
        i--;
    }
  }
}
