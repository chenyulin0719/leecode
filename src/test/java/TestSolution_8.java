import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSolution_8 {

  public TestSolution_8() {
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
  public void testMyAtoi() {
    Solution_8 instance = new Solution_8();
    String input1 = "123";
    int expect1 = 123;
    int result1 = instance.myAtoi(input1);
    assertEquals("input1:" + input1, expect1, result1);


    String input2 = "    10522545459";
    int expect2 = 2147483647;
    int result2 = instance.myAtoi(input2);
    assertEquals("input2:" + input2, expect2, result2);
  }
}
