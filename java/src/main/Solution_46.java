import java.util.ArrayList;
import java.util.List;

public class Solution_46 {
  private boolean[] visited;

  public List<List<Integer>> permute(int[] nums) {
    visited = new boolean[nums.length];
    List<List<Integer>> res = new ArrayList<>();
    permuteDFS(nums, new ArrayList<>(), res);
    return res;
  }

  private void permuteDFS(int[] nums, List<Integer> current, List<List<Integer>> res) {
    if (current.size() == nums.length) {
      res.add(new ArrayList<>(current));
      return;
    }
    for (int i = 0; i < nums.length; i++) {
      if (!visited[i]) {
        visited[i] = true;
        current.add(nums[i]);
        permuteDFS(nums, current, res);
        current.remove(current.size() - 1);
        visited[i] = false;
      }
    }
  }
}