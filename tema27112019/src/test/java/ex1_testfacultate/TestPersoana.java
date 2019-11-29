package ex1_testfacultate;

import ex1_facultate.Angajat;
import ex1_facultate.Persoana;
import ex1_facultate.Statut;
import ex1_facultate.Student;

public class TestPersoana {

    Persoana persoana1= new Persoana("Nicoleta Oprea", "Craiova", 0724553792, "nicoletadinu83@yahoo.com");


    Student student1= new Student(Statut.JUNIOR);
    Angajat angajat1=new Angajat("Nicoleta Oprea", "Craiova", 0724553792, "nicoletadinu83@yahoo.com",
            Statut.JUNIOR);

    persoana1.toString();

    }

}
