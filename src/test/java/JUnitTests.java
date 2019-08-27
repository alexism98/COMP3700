import org.junit.*;

import static org.junit.Assert.assertEquals;
public class JUnitTests {
    @Test
    public void test_findMaxValid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{1,28,4,12,6};
        int expectedResult = 28;
        int actualResult = finder.findMax(intArray);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test_findMaxInvalid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{};
        Integer expectedResult = null;
        Integer actualResult = finder.findMax(intArray);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test_findMinValid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{1,28,4,12,6};
        int expectedResult = 1;
        int actualResult = finder.findMin(intArray);
        assertEquals(actualResult,expectedResult);
    }
    @Test
    public void test_findMinInvalid() {
        Finder finder = new Finder();
        int[] intArray = new int[]{};
        Integer expectedResult = null;
        Integer actualResult = finder.findMin(intArray);
        assertEquals(actualResult,expectedResult);
    }
}
