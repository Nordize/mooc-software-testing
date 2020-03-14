package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {

    @Test
    void test1(){
        TwoNumbersSum twoNum = new TwoNumbersSum();

        ArrayList<Integer> firstNum = new ArrayList<Integer>();
        ArrayList<Integer> secondNum = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();

        firstNum.add(1);
        firstNum.add(2);
        firstNum.add(3);

        secondNum.add(4);
        secondNum.add(5);
        secondNum.add(6);


        result = twoNum.addTwoNumbers(firstNum,secondNum);

        Assertions.assertEquals(3, result.size());

    }
}
