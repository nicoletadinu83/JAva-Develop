import ex3_Game.Hero;
import ex3_Game.NonPlayerCharacter;
import org.junit.Assert;
import org.junit.Test;

public class TestGame {
    @Test
    public void testGame(){


        Hero hero= new Hero(100, 10);
        NonPlayerCharacter enemy1 = new NonPlayerCharacter(100, 2);
        enemy1.decressLife(); // printeaza pe ecran O sa te atack
       Assert.assertEquals(98, enemy1.decressLife());
       hero.decressLife(); // nu printeaza nimic pe ecran
       Assert.assertEquals(90, hero.decressLife());
    }
}
