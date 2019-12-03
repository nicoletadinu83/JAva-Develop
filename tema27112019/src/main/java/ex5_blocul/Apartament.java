package ex5_blocul;
/*Un bloc pate sa aiba mai multe etaje pe fiecare etaj pot sa existe mai multe apartamente.
        Bloc - nume bloc
        Etaj - numar etaj
        Apartament - numar apartament
        - nume familie*/


public class Apartament extends  Etaj {
     private int numarApartament;
     private String numeFamilie;


    public Apartament(String numeBloc, int numarEtaj, int numarApartament, String numeFamilie) {
        super(numeBloc, numarEtaj);
        this.numarApartament = numarApartament;
        this.numeFamilie = numeFamilie;
    }

    public int getNumarApartament() {
        return numarApartament;
    }

    public void setNumarApartament(int numarApartament) {
        this.numarApartament = numarApartament;
    }

    public String getNumeFamilie() {
        return numeFamilie;
    }

    public void setNumeFamilie(String numeFamilie) {
        this.numeFamilie = numeFamilie;
    }
     public void adaugaApartament(Apartament apartament){
         System.out.println("etaj -"+ getNumarEtaj()+ "||" + getNumeFamilie());
     }
}


