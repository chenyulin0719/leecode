import org.junit.*;

import static org.junit.Assert.*;

public class TestSolution_5 {
  
  public TestSolution_5() {
  }
  
  @BeforeClass
  public static void setUpClass() {
  }
  
  @AfterClass
  public static void tearDownClass() {
  }
  
  @Before
  public void setUp() {
  }
  
  @After
  public void tearDown() {
  }

  @Test
  public void testLongestPalindrome_v2() {
    Solution_5v2 instance = new Solution_5v2();
    String input1 = "cbbd";
    String output1 = "bb";
    String result1 = instance.longestPalindrome(input1);
    assertEquals(output1, result1);

    String input2 = "babad";
    String output2 = "bab";
    String result2 = instance.longestPalindrome(input2);
    assertEquals(output2, result2);



  }

  @Test
  public void testLongestPalindrome_v3() {
    Solution_5v3 instance = new Solution_5v3();
    String input1 = "cbbd";
    String output1 = "bb";
    String result1 = instance.longestPalindrome(input1);
    assertEquals(output1, result1);

    String input2 = "babad";
    String output2 = "bab";
    String result2 = instance.longestPalindrome(input2);
    assertEquals(output2, result2);

    String input3 = "a";
    String output3 = "a";
    String result3 = instance.longestPalindrome(input3);
    assertEquals(output3, result3);
  }
}
