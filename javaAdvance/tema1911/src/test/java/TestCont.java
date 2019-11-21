import com.sdacademy.oop2.tema.Cont;
import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class TestCont {
    @Test
    public void testCont(){
        Cont cont1=new Cont(1,1000);
        Date now =new Date();
        System.out.println(now);
        Assert.assertEquals(1, cont1.getId());
        Assert.assertEquals(1000,cont1.getSold(),2);

       // cont1.setDateCreated(Calendar.getAvailableLocales());
        //Assert.assertEquals();
    }
}
