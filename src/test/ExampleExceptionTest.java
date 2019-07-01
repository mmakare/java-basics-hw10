import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleExceptionTest {

  /**
   * Test data for positive test.
   *
   * @return test data array
   */
  @DataProvider(name = "data")
  public static Object[][] data() {
    return new Object[][]{
        {2, 2, 4},
        {2, 2, 4},
        {10, 10, 100},
        {2, 20, 40},
        {2, 3, 6}
        // TODO add 2 more test data here
    };
  }

  /**
   * Test data for exception test.
   *
   * @return test data array
   */
  @DataProvider(name = "negativeData")
  public static Object[][] negativeData() {
    return new Object[][]{
        {-2, 2},
        {-3, -10},
        {5, 0},
        {2, -2}
        // TODO add 2 more test data here
    };
  }

  @Test(dataProvider = "data")
  public void testRectangleArea(int a, int b, int c) {
    // TODO put your code here3
    assertEquals(ExampleException.rectangleArea(a, b), c);
  }


  @Test(dataProvider = "negativeData")
  public void testRectangleAreaNegative(int a, int b) {

    // TODO put your code here

      try {
          ExampleException.rectangleArea(a, b);
          fail("The data doesn't relates to exception!");
      }
      catch(IllegalArgumentException r) {
        assertEquals(r.getMessage(), "input value is below zero!");
      }
  }
}