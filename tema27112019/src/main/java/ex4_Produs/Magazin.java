package ex4_Produs;

import java.util.Map;

public class Magazin {

    Map <Produs, Integer> stocProduse;

    public void adaugaStocProduse(Produs produs, int stock){
        System.out.println("Stocul de "+ produs + " este:  "+ stock );
    }

    public int cumparaProdus(Produs produs){
        return stocProduse.size()-1;
    }
}
