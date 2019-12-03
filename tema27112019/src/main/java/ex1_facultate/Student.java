package ex1_facultate;

public class  Student extends Persoana {
     private Statut st;

    public Student(Statut st) {
        super();
        this.st = st;
    }

    public Statut getSt() {
        return st;
    }

    public void setSt(Statut st) {
        this.st = st;
    }

    @Override
    public String toString() {
        System.out.println("Clasa Student"+ getNume() );
        return null;
    }
}
