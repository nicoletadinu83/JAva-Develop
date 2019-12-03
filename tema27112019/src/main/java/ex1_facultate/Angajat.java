package ex1_facultate;

public class Angajat extends Persoana {
    private int birou;
    private  double salariu;

    //private Date dataAngajarii
    private String dataAngajarii;


    public Angajat(String nume, String adresa, int telefon, String email, String dataAngajarii) {
        super(nume, adresa, telefon, email);
        this.dataAngajarii = "June 24,2014";
    }

    public int getBirou() {
        return birou;
    }

    public void setBirou(int birou) {
        this.birou = birou;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public String getDataAngajarii() {
        return dataAngajarii;
    }

    public void setDataAngajarii(String dataAngajarii) {
        this.dataAngajarii = dataAngajarii;
    }

    @Override
    public String toString() {
        System.out.println("Clasa angajat " + getNume() );;
        return null;
    }

    public void  toString(String z) {
        super.toString();
    }
}
