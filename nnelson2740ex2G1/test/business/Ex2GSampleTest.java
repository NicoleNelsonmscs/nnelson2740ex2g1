package business;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2GSampleTest {


    @Test
    void getI1() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertEquals(0, result);

    }

    @Test
    void getI2() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI2();
        assertEquals(2, result);
    }


    @Test
    void getD1() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        Double result = obj1.getD1();
        assertEquals(3.0, result);
    }

    @Test
    void getD2() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        Double result = obj1.getD2();
        assertEquals(4.0, result);
    }

    @Test
    void getS1() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        String result = obj1.getS1();
        assertEquals("Aaaa", result);
    }

    @Test
    void getS2() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        String result = obj1.getS2();
        assertEquals("Bbbb", result);
    }

    @Test
    void test1_BelowRange() {
        Ex2GSample obj1 = new Ex2GSample(0, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertFalse(obj1.test1(), "Testing i1 - below valid range.");
    }

    @Test
    void test1_WithinRange1() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertTrue(obj1.test1(), "Testing i1 - lowest value in range.");
    }

    @Test
    void test1_WithinRange10() {
        Ex2GSample obj1 = new Ex2GSample(10, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertTrue(obj1.test1(), "Testing i1 - highest value in range.");

    }

    @Test
    void test1_AboveRange() {
        Ex2GSample obj1 = new Ex2GSample(11, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertFalse(obj1.test1(), "Testing i1 - above valid range.");

    }

    @Test
    void test2_BelowRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertFalse(obj1.test2(), "Testing i2 - below valid range.");
    }

    @Test
    void test2_WithinRange1() {
        Ex2GSample obj1 = new Ex2GSample(2, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertTrue(obj1.test2(), "Testing i1 - within range.");
    }

    @Test
    void test2_AboveRange() {
        Ex2GSample obj1 = new Ex2GSample(3, 1, 3.0, 4.0, "Aaaa", "Bbbb");
        int result = obj1.getI1();
        assertFalse(obj1.test2(), "Testing i1 - above valid range.");
    }

    @Test
    void test3_Aaaa() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "Aaaa", "Bbbb");
        String result = "Aaaa";
        assertEquals(obj1.test3(), result);
    }

    @Test
    void test3_Bbbb() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "Bbbb", "Bbbb");
        String result = "Bbbb";
        assertEquals(obj1.test3(), result);
    }

    @Test
    void test3_Bbb() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "Bbb", "Bbbb");
        String result = "Bbb";
        assertEquals(obj1.test3(), result);
    }

    @Test
    void test3_C() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "C", "Bbbb");
        String result = "Bbbb";
        assertEquals(obj1.test3(), result);
    }

    @Test
    void test3_BbbbSpace() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "Bbbb ", "Bbbb");
        String result = "Bbbb";
        assertEquals(obj1.test3(), result);
    }

    @Test
    void test3_99100() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 3.0, 4.0, "99", "100");
        String result = "100";
        assertEquals(obj1.test3(), result);
    }

    @Test
    void test4_D1BelowRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 0, 7.50, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test4(), result);
    }

    @Test
    void test4_D1AboveRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 168.1, 7.50, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test4(), result);
    }

    @Test
    void test4_D2BelowRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 40, 7.50, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test4(), result);
    }

    @Test
    void test4_D2AboveRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 40, 100.00, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test4(), result);
    }

    @Test
    void test4_NoOvertime() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 40, 10, "Aaaa", "Bbbb");
        Double result = 400.0;
        assertEquals(obj1.test4(), result);
    }

    @Test
    void test4_Overtime() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "Aaaa", "Bbbb");
        Double result = 550.0;
        assertEquals(obj1.test4(), result);
    }

    @Test
    void test5_D1BelowRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 0, 7.50, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test5(), result);
    }

    @Test
    void test5_D1AboveRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 168.1, 7.50, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test5(), result);
    }

    @Test
    void test5_D2BelowRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 40, 7.50, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test5(), result);
    }

    @Test
    void test5_D2AboveRange() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 40, 100.00, "Aaaa", "Bbbb");
        Double result = -1.0;
        assertEquals(obj1.test5(), result);
    }

    @Test
    void test5_NoOvertime() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 40, 10, "Aaaa", "Bbbb");
        Double result = 400.0;
        assertEquals(obj1.test5(), result);
    }

    @Test
    void test5_Overtime() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "Aaaa", "Bbbb");
        Double result = 550.0;
        assertEquals(obj1.test5(), result);
    }

    @Test
    void test6_Null() {
        Ex2GSample obj1 = new Ex2GSample();
        Boolean result = false;
        assertEquals(obj1.test6(), result);
    }

    @Test
    void test6_Null2() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "", "Bbbb");
        Boolean result = false;
        assertEquals(obj1.test6(), result);
    }

    @Test
    void test6_aaaaSpace() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "aaaa ", "Bbbb");
        Boolean result = false;
        assertEquals(obj1.test6(), result);
    }

    @Test
    void test6_dddd() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "dddd", "Bbbb");
        Boolean result = false;
        assertEquals(obj1.test6(), result);
    }

    @Test
    void test6_aaaa() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "aaaa", "Bbbb");
        Boolean result = true;
        assertEquals(obj1.test6(), result);
    }

    @Test
    void test6_cccc() {
        Ex2GSample obj1 = new Ex2GSample(1, 2, 50, 10, "cccc", "Bbbb");
        Boolean result = true;
        assertEquals(obj1.test6(), result);
    }
}