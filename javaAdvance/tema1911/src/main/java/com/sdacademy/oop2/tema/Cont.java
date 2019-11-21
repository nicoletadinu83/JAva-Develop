package com.sdacademy.oop2.tema;
/*
(Clasa Cont) Proiectați o clasă numită Cont care conține:
■ Un câmp de date de int privat numit id pentru cont (implicit 0).
■ Un câmp double de date privat numit sold pentru cont (implicit 0).
■ Un câmp double de date private numit anualInterestRate care stochează rata dobânzii curente (implicit 0).
Presupunem că toate conturile au aceeași rată a dobânzii.
■ Un câmp de date private Date numit dateCreated care stochează data la care
contul a fost creat.
■ Un constructor fără argument care creează un cont implicit.
■ Constructor care creează un cont cu ID-ul specificat și soldul inițial.
■ Metodele de acesare și de mutare pentru ID, sold și anualInterestRate.
■ Metoda de acesare pentru dateCreated.
■ O metodă numită getMonthlyInterestRate () care returnează lunar
rata dobânzii.
■ O metodă numită retragere care retrage o sumă specificată din
cont.
■ Metodă numită depozit care depune o sumă specificată în cont.
 */

import java.util.Date;
import java.util.Date;

public class Cont {
    private int id = 0;
    private double sold = 0;
    private double anualInterestRate = 0;
    private Date dateCreated;

    public Cont(int id, double sold) {
        this.id = id;
        this.sold = sold;
    }

    public Cont() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }


    public double getAnualInterestRate() {
        return anualInterestRate;
    }

    public void setAnualInterestRate(double anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(){
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return sold * anualInterestRate/100;
    }

   /*double y = 0;

    public double retragere()
    {
        return sold - y;
    }

    public double depozit() {

        return sold - y;
    }*/


}

