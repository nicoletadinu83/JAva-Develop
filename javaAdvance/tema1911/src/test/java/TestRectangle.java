import com.sdacademy.oop2.tema.Rectangle;
import org.junit.Assert;
import org.junit.Test;

public class TestRectangle {

    @Test
    public void testRectangle() {
        Rectangle rectangle1 = new Rectangle(1,2);
        rectangle1.setLungime(2);
        rectangle1.setLatime(3);


        Assert.assertEquals(2,rectangle1.getArea(1,1),2);
        Assert.assertEquals(12, rectangle1.getPerimeter(2,3),2);
    }
}
