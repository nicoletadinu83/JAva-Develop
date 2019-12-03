package ex4_Produs;

import java.util.Date;

public class Fructe extends Perisable {
  private String taraOrigine;

    public Fructe(double price, String nume, String productor, UnitateDeMasura unitateDeMasura, String taraOrigine) {
        super(price, nume, productor, unitateDeMasura);
        this.taraOrigine = taraOrigine;
    }
}
