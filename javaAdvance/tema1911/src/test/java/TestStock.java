import com.sdacademy.oop2.tema.Stock;
import org.junit.Assert;
import org.junit.Test;

public class TestStock {

@Test
    public void testStock(){

    Stock stock1=new Stock("$", "carte");
    stock1.setClosingPrice(100);
    stock1.setCurrentPrice(120);

    Assert.assertEquals(20,stock1.getChangePercent(),2 );
}
}
