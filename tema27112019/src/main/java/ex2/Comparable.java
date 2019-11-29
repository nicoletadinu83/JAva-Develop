package ex2;
/*
Creaza o interfata generica Comparable<T> care contine metoda :
public int compareTo(T itemToBeCompared)
Creaza o clasa Patrat care contine latura si metoda getArea.
Clasa Patrat va implementa interfata generica Comparable:
ex : public class Patrat implements Comparable<Patrat> {
implementati metodat compareTo(Patrat patrat) astfel
daca patrat.getArea() > this.getArea()
return -1;
daca patrat.getArea() < this.getArea()
return 1;
daca patrat.getArea() = this.getArea()
return 0;

Creati un test care:
Creaza 2 obiecte de tip patrat.
Patrat patrat1 = new Patrat(2);
Patrat patrat2 = new Patrat(3);

verificati metoda compare:
Assert.equals(patrat1.compareTo(patrat2), 1)

Folosind exemplu de mai sus creati o clasa Persoana care are varsta si implementeaza
interfata Comparable pentru a compara varsta a doua persoane.

Creati un test care va verifica compareTo pe persoane

 */




public interface Comparable<T> {

       abstract T compareTo(T itemToBeCompared);

    }


