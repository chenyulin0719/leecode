import java.util.*;

public class Solution_39 {
  Map<Integer, List<List<Integer>>> dp = new HashMap<>();

  public List<List<Integer>> combinationSumDFS(int[] candidates, int target) {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> cur = new ArrayList<>();
    combinationSumDFS(candidates, 0, cur, res, target);
    return res;
  }

  private void combinationSumDFS(int[] candidates, int start, List<Integer> cur, List<List<Integer>> res, int target) {
    for (int i = start; i < candidates.length; i++) {
      if (target > candidates[i]) {
        cur.add(candidates[i]);
        combinationSumDFS(candidates, i, cur, res, target - candidates[i]);
        cur.remove(cur.size() - 1);
      } else if (target == candidates[i]) {
        cur.add(candidates[i]);
        res.add(new ArrayList<>(cur));
        cur.remove(cur.size() - 1);
      }
    }
  }

  public List<List<Integer>> combinationSumRecursive(int[] candidates, int target) {
    Arrays.sort(candidates);
    return combinationSumRecursive(candidates, candidates.length - 1, target);
  }

  private List<List<Integer>> combinationSumRecursive(int[] candidates, int tail, int target) {
    List<List<Integer>> result = new ArrayList<>();
    for (int i = 0; i <= tail; i++) {
      if (candidates[i] == target) {
        result.add(Arrays.asList(target));
        continue;
      }
      if (target - candidates[i] > 0) {
        List<List<Integer>> subResult = combinationSumRecursive(candidates, i, target - candidates[i]);
        for (List<Integer> list : subResult) {
          List<Integer> newList = new ArrayList<>(list);
          newList.add(candidates[i]);
          result.add(newList);
        }
      }
    }
    return result;
  }
}
