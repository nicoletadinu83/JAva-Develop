package com.sdacademy.oop2.tema;
/*(Clasa Dreptunghi)
        proiectați o clasă numită Rectangle pentru a reprezenta un dreptunghi. Clasa conține:
        ■ Două câmpuri de date double numite lățime și lungime care specifică lățimea
        și lungime dreptunghiului. Valorile implicite sunt 1 atât pentru lățime cât și pentru lungime .
        ■ Un constructor fără argumente, care creează un dreptunghi implicit.
        ■ Constructor care creează un dreptunghi cu lățimea și lungime specificate.
        ■ O metodă numită getArea () care returnează aria acestui dreptunghi.
        ■ O metodă numită getPerimeter () care returnează perimetrul*/

public class Rectangle {
    private double latime = 1;
    private double lungime = 1;

    public Rectangle() {
    }

    public Rectangle(double latime, double lungime) {
        this.latime = latime;
        this.lungime = lungime;
    }

    public double getLatime() {
        return latime;
    }

    public void setLatime(double latime) {
        this.latime = latime;
    }

    public double getLungime() {
        return lungime;
    }

    public void setLungime(double lungime) {
        this.lungime = lungime;
    }

    public double getArea(double latime, double lungime) {
        return latime * lungime;
    }

    public double getPerimeter(double latime, double lungime) {
        return 2 * (latime + lungime);
    }


    }
