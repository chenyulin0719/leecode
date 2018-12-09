import org.junit.Test;

import static org.junit.Assert.*;

public class Solution_71Test {
  @Test
  public void simplifyPath2() {
    Solution_71 instance = new Solution_71();
    assertEquals("/home", instance.simplifyPath2("/home/"));
    assertEquals("/c", instance.simplifyPath2("/a/./b/../../c/"));
    assertEquals("/c", instance.simplifyPath2("/a/../../b/../c//.//"));
    assertEquals("/a/b/c", instance.simplifyPath2("/a//b////c/d//././/.."));
  }

  @Test
  public void simplifyPath() {
    Solution_71 instance = new Solution_71();
    assertEquals("/home", instance.simplifyPath("/home/"));
    assertEquals("/c", instance.simplifyPath("/a/./b/../../c/"));
    assertEquals("/c", instance.simplifyPath("/a/../../b/../c//.//"));
    assertEquals("/a/b/c", instance.simplifyPath("/a//b////c/d//././/.."));
  }
}
