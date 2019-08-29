import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class FinderTest {

    @Test
    public void test_MaxArray() {
        Finder x = new Finder();
        int[] array1 = {12, 4, 16};
        int[] array2 = {2,4,-5};
        int[] array3 = {18, 10, 3};

        assertEquals(new Integer(16), x.findMax(array1));
        assertEquals(new Integer(4), x.findMax(array2));
        assertEquals(new Integer(18), x.findMax(array3));
    }
    @Test
    public void test_MinArray() {
        Finder x = new Finder();
        int[] array1 = {12, 4, 63};
        int[] array2 = {23,33};
        int[] array3 = {99, 999, 9999};

        assertEquals(new Integer(4), x.findMin(array1));
        assertEquals(new Integer(23), x.findMin(array2));
        assertEquals(new Integer(99), x.findMin(array3));
    }
    @Test
    public void test_NullMaxArray() {
        Finder x = new Finder();
        assertNull(x.findMax(null));

        int[] emptyArray = {};
        assertNull(x.findMax(emptyArray));

    }
    @Test
    public void test_NullMinArray() {
        Finder x = new Finder();
        assertNull(x.findMin(null));

        int[] emptyArray = {};
        assertNull(x.findMin(emptyArray));
    }
}