import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSolution_7 {

  public TestSolution_7() {
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
  public void testReverseInteger() {
    Solution_7 instance = new Solution_7();
    int input1 = 123;
    int expect1 = 321;
    int result1 = instance.reverse(input1);
    assertEquals("input:" + input1, expect1, result1);

    int input2 = -123;
    int expect2 = -321;
    int result2 = instance.reverse(input2);
    assertEquals("input:" + input2, expect2, result2);

    int input3 = 120;
    int expect3 = 21;
    int result3 = instance.reverse(input3);
    assertEquals("input:" + input3, expect3, result3);

    int input4 = 1534236469;
    int expect4 = 0;
    int result4 = instance.reverse(input4);
    assertEquals("input:" + input4, expect4, result4);

  }
}
