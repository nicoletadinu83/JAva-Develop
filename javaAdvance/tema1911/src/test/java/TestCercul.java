import com.sdacademy.oop2.tema.Cercul;
import org.junit.Assert;
import org.junit.Test;

public class TestCercul {

    @Test
    public void cerc() {
        Cercul cerc1 = new Cercul(1);

        Assert.assertEquals(3.14, cerc1.razaCercului(), 2);

        Cercul cerc2 = new Cercul(2);
        Assert.assertEquals(12.56, cerc2.razaCercului(),2);

//Assert.assertEquals(3.14, cerc1.razaCercului());
    }
}
