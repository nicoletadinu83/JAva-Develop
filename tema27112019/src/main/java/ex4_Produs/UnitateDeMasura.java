package ex4_Produs;

public enum UnitateDeMasura {
    BUCATA(0),
    KILOGRAM(0);

     public int masura;

    UnitateDeMasura(int masura) {
        this.masura = masura;
    }

    public int getMasura() {
        return masura;
    }

    public void setMasura(int masura) {
        this.masura = masura;
    }


}
