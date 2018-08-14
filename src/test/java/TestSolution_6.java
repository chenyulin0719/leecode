import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSolution_6 {

  public TestSolution_6() {
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
  public void testZigZagConvert() {
    Solution_6 instance = new Solution_6();
    String input = "PAYPALISHIRING";
    int inputRow = 3;
    String expect = "PAHNAPLSIIGYIR";
    String result1 = instance.convert(input,inputRow);
    assertEquals("input:"+input,expect, result1);
  }
}
