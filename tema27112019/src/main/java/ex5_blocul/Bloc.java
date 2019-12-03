package ex5_blocul;

public class Bloc {

    public Bloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    private String numeBloc;

    public String getNumeBloc() {
        return numeBloc;
    }

    public void setNumeBloc(String numeBloc) {
        this.numeBloc = numeBloc;
    }

    public void adaugaApartament(Apartament apartament){
        System.out.println("etaj -"+ apartament.getNumarEtaj()+ "||"+ apartament.getNumarApartament()+" ||" + apartament.getNumeFamilie());
    }
     public Etaj adaugaEtaj(Etaj etaj){
        return etaj;
     }
      public Bloc afiseazaBloc(Bloc bloc){
        return bloc;
      }
}
