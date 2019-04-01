package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    public void test1() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList();
        a.add(1);
        a.add(2);
        ArrayList<Integer> b = new ArrayList();
        b.add(2);
        b.add(1);
        ArrayList<Integer> c = new ArrayList();
        c.add(3);
        c.add(3);

        ArrayList<Integer> result = sum.addTwoNumbers(a, b);

        Assertions.assertEquals(c, result);
    }

    @Test
    public void test2() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList();
        a.add(9);
        a.add(5);
        ArrayList<Integer> b = new ArrayList();
        b.add(1);
        b.add(5);
        ArrayList<Integer> c = new ArrayList();
        c.add(1);
        c.add(1);
        c.add(0);

        ArrayList<Integer> result = sum.addTwoNumbers(a, b);

        Assertions.assertEquals(c, result);
    }

    @Test
    public void test3() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList();
        a.add(9);
        a.add(9);
        ArrayList<Integer> b = new ArrayList();
        b.add(9);
        b.add(9);
        ArrayList<Integer> c = new ArrayList();
        c.add(1);
        c.add(9);
        c.add(8);

        ArrayList<Integer> result = sum.addTwoNumbers(a, b);

        Assertions.assertEquals(c, result);
    }

    @Test
    public void test4() {
        TwoNumbersSum sum = new TwoNumbersSum();
        ArrayList<Integer> a = new ArrayList();
        a.add(2);
        a.add(4);
        a.add(3);
        ArrayList<Integer> b = new ArrayList();
        b.add(5);
        b.add(6);
        b.add(4);
        ArrayList<Integer> c = new ArrayList();
        c.add(8);
        c.add(0);
        c.add(7);

        ArrayList<Integer> result = sum.addTwoNumbers(a, b);

        Assertions.assertEquals(c, result);
    }
}
