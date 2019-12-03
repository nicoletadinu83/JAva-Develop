package ex4_Produs;

public class Carne extends Produs {

    private TipCarne tipcarne;


    public Carne(double price, String nume, String productor, UnitateDeMasura unitateDeMasura, TipCarne tipcarne) {
        super(price, nume, productor, unitateDeMasura);
        this.tipcarne = tipcarne;
    }

    public TipCarne getTipcarne() {
        return tipcarne;
    }

    public void setTipcarne(TipCarne tipcarne) {
        this.tipcarne = tipcarne;
    }
}
