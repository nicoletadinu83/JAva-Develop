import ex5_blocul.Apartament;
import ex5_blocul.Bloc;
import ex5_blocul.Etaj;
import org.junit.Test;

public class TestBlocul {
    @Test
    public void testBlocul() {


        Bloc bloc = new Bloc("E2");
        Etaj etajul0 = new Etaj("E2", 0);
        Apartament ap1 = new Apartament("E2", 0, 1,"fam Ionescu");

        etajul0.adaugaApartament(ap1);

        Apartament ap2 = new Apartament("E2", 0, 2, "fam Popescu");
        etajul0.adaugaApartament(ap2);

        bloc.adaugaEtaj(etajul0);
        bloc.afiseazaBloc(bloc);

        System.out.println("==========================================");

        Etaj etajul1 = new Etaj("E2", 1);
        Apartament ap3 = new Apartament("E2", 1, 3,"fam Georgescu");
        etajul1.adaugaApartament(ap3);
        Apartament ap4 = new Apartament("E2", 1, 4, "fam Vladimirescu");
        etajul1.adaugaApartament(ap4);
        Apartament ap5 = new Apartament("E2", 1, 5, "fam Tutulescu");
        etajul1.adaugaApartament(ap5);
        bloc.adaugaEtaj(etajul1);
        bloc.afiseazaBloc(bloc);
        
    }
}
