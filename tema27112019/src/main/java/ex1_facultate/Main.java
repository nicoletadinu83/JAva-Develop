package ex1_facultate;

public class Main {
    Persoana persoana1= new Persoana("Nicoleta Oprea", "Craiova", 724553792, "nicoletadinu83@yahoo.com");

    Student student1= new Student(Statut.JUNIOR);
    Angajat angajat1 = new Angajat("Nicoleta Oprea", "Craiova", 724553792, "nicoletadinu83@yahoo.com",
            "June 24,2014");

    public Persoana getPersoana1() {
        return persoana1;
    }
    public void toString(String z){
        System.out.println("Clasa Person "+getNume());
    }
    persoana1.toString();

}


}
