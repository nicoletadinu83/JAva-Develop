package com.sdacademy.oop2.tema;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
/*Crearea unui cerc care contine un membru de tip double numit raza si are o metoda prin care obtinem aria cercului.*/
public class Cercul {
    private double raza ;


    public Cercul(double raza) {
        this.raza = raza;
    }

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    public double razaCercului(){
        double p=Math.PI;
        return raza*raza*p;
    }

}
