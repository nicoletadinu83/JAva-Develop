package ex4_Produs;

public class Haine extends  Produs {
    private String numeMaterial;
    private UnitateDeMasura unitateDeMasura;


    public Haine(double price, String nume, String productor, UnitateDeMasura unitateDeMasura, String numeMaterial, UnitateDeMasura unitateDeMasura1) {
        super(price, nume, productor, unitateDeMasura);
        this.numeMaterial = numeMaterial;
        this.unitateDeMasura = unitateDeMasura1;
    }

    public String getNumeMaterial() {
        return numeMaterial;

    }

    public void setNumeMaterial(String numeMaterial) {
        this.numeMaterial = numeMaterial;
    }

    public UnitateDeMasura getUnitateDeMasura() {
        return unitateDeMasura;
    }


}
