import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSolution_9 {

  public TestSolution_9() {
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
  public void testIsPalindrome() {
    Solution_9 instance = new Solution_9();
    int input1 = 123;
    boolean expect1 = false;
    boolean result1 = instance.isPalindrome(input1);
    assertEquals("input1:" + input1, expect1, result1);

    int input2 = 12321;
    boolean expect2 = true;
    boolean result2 = instance.isPalindrome(input2);
    assertEquals("input2:" + input2, expect2, result2);

    int input3 = 10;
    boolean expect3 = false;
    boolean result3 = instance.isPalindrome(input3);
    assertEquals("input3:" + input3, expect3, result3);
  }
}
