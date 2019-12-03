package ex1_facultate;

public class Main {
    public static void main(String[] args) {


        Persoana persoana1 = new Persoana("Nicoleta Oprea", "Craiova", 724553792, "nicoletadinu83@yahoo.com");

        Student student1 = new Student(Statut.JUNIOR);
        Angajat angajat1 = new Angajat("Nicoleta Oprea", "Craiova", 724553792, "nicoletadinu83@yahoo.com",
                "June 24,2014");


       /* public void toString(){
            System.out.println("Clasa Person " + persoana1.getNume());
        }
        */
       persoana1.toString();



    }
}



