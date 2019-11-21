import com.sdacademy.oop2.tema.Calculator;
import org.junit.Assert;
import org.junit.Test;

import static netscape.security.Privilege.add;

public class TestCalculator {
    Calculator calculator3=new Calculator();

    @Test
    public void testCalculator() {

        Calculator calculator1 = new Calculator();
        calculator1.setNum1(10);
        calculator1.setNum2(5);

        Assert.assertEquals(15, calculator1.add());
        Assert.assertEquals(5, calculator1.substract());
        Assert.assertEquals(2, calculator1.divide());
        Assert.assertEquals(50, calculator1.multiply());
        Assert.assertEquals(10, calculator1.getNum1());

        Assert.assertEquals(5, calculator1.getNum2());

    }

    @Test
    //la impartirea cu zero arunca exceptia
    public void test2() {
        Calculator calculator2 = new Calculator();
        calculator2.setNum1(15);
        calculator2.setNum2(0);

        Assert.assertEquals(15, calculator2.add());
        Assert.assertEquals(15, calculator2.substract());
        Assert.assertEquals(0, calculator2.divide());
        Assert.assertEquals(0, calculator2.multiply());
        Assert.assertEquals(15, calculator2.getNum1());

        Assert.assertEquals(0, calculator2.getNum2());

    }
}
