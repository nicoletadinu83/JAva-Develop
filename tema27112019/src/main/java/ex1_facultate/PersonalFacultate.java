package ex1_facultate;

public class PersonalFacultate extends Angajat {
    private String titlu;

    public PersonalFacultate(String nume, String adresa, int telefon, String email, String dataAngajarii, String titlu) {
        super(nume, adresa, telefon, email, dataAngajarii);
        this.titlu = titlu;
    }

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }
}
