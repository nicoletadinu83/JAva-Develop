package ex1_facultate;

//Proiecteaa o
//clasa numită Persoană și cele două subclase ale sale numite Student și Angajat.
//Faceți subclase ale calsei Angajat numite MembruFacultate și PersonalFacultate. O persoană are un nume,
//adresa, numărul de telefon și adresa de e-mail. Un student are statut de clasă (boboc,
//sophomore, junior sau senior). Definiți statutul ca un enum. Un angajat are un
//birou, salariu și data angajată. Data angajari este de tipulunei noi clase numită MyDate care conține câmpurile
//an, lună și zi. Un membru al facultății are ore de birou și un rang. Un personal
//facultate are un titlu.
//Suprascrieti metoda toString din fiecare clasă pentru a afișa numele clasei și numele persoanei.

public class Persoana {
    private String nume;
    private String adresa;
    private double telefon;
    private String email;

    public Persoana(String nume, String adresa, int telefon, String email) {
        this.nume = nume;
        this.adresa = adresa;
        this.telefon = telefon;
        this.email = email;
    }

    public Persoana() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public double getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
     public void toString(String z){
         System.out.println("Clasa Person "+getNume());
     }
}

