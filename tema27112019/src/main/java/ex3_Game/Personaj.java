package ex3_Game;

 public abstract class Personaj {
    private int  viata;
    private int putereDeAtac;

    public Personaj(int viata, int putereDeAtac) {
        this.viata = viata;
        this.putereDeAtac = putereDeAtac;
    }

    public int getViata() {
        return viata;
    }

    public void setViata(int viata) {
        this.viata = viata;
    }

    public int getPutereDeAtac() {
        return putereDeAtac;
    }

    public void setPutereDeAtac(int putereDeAtac) {
        this.putereDeAtac = putereDeAtac;
    }
public abstract int decressLife();

}


