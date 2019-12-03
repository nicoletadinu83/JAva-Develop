package ex5_blocul;

public class Etaj extends  Bloc {

    private int numarEtaj;

    public Etaj(String numeBloc, int numarEtaj) {
        super(numeBloc);
        this.numarEtaj = numarEtaj;
    }

    public int getNumarEtaj() {
        return numarEtaj;
    }

    public void setNumarEtaj(int numarEtaj) {
        this.numarEtaj = numarEtaj;
    }
}
