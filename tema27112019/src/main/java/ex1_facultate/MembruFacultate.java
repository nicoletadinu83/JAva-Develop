package ex1_facultate;

public class MembruFacultate extends Angajat {
    private String oreDeBirou;
    private  String rang;

    public MembruFacultate(String nume, String adresa, int telefon, String email, MyDate dataAngajarii, String oreDeBirou, String rang) {
        super(nume, adresa, telefon, email, dataAngajarii);
        this.oreDeBirou = oreDeBirou;
        this.rang = rang;
    }

    public String getOreDeBirou() {
        return oreDeBirou;
    }

    public void setOreDeBirou(String oreDeBirou) {
        this.oreDeBirou = oreDeBirou;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
}
