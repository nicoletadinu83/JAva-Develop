package ex4_testMagazin;

import ex4_Produs.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestMagazin {
    @Test

    public void testMagazin(){

        List<Produs> cosCumparaturi = new ArrayList<Produs>();

         Produs produs1= new Produs(1.50, "mere", "Lidl", UnitateDeMasura.KILOGRAM);
        Produs produs11= new Produs(2.50, "pere", "Lidl", UnitateDeMasura.KILOGRAM);

        cosCumparaturi.add(produs1 );
        cosCumparaturi.add(produs11 );



        Produs produs2= new Carne(2.5,"carne de pui","puiul fericit", UnitateDeMasura.KILOGRAM, TipCarne.PUI );
        cosCumparaturi.add(produs2 );

        Produs produs3= new Haine(10,"blugi","J.L",UnitateDeMasura.BUCATA,"blug",
                UnitateDeMasura.BUCATA );

        cosCumparaturi.add(produs3 );
         for(Produs produs: cosCumparaturi){
             System.out.println(produs);
         }

         Magazin magazin1= new Magazin();
         magazin1.adaugaStocProduse(produs1, 100);
         magazin1.adaugaStocProduse(produs2, 2500);
         magazin1.adaugaStocProduse(produs3, 20);


       /* Produs produs1 = cautaProdus("Mere");
        cosCumparaturi.add(produs1 );
        cosCumparaturi.add(produs1 );
        Produs produs2 = cautaProdus("Carne");
        cosCumparaturi.add(produs2);
        cosCumparaturi.add(produs2);
        cosCumparaturi.add(produs2);
        Produs produs3 = cautaProdus("Blugi");
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);
        cosCumparaturi.add(produs3);*/

    }
}
