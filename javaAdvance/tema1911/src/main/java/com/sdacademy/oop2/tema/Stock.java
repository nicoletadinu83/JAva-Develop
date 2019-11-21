package com.sdacademy.oop2.tema;


/*(Clasa stock), proiectați o clasă numită Stock care conține:
        ■ Un câmp de date String numit simbol pentru simbolul stoc.
        ■ Un câmp de date String numit stoc.
        ■ Un câmp double de date denumit anterior closingPrice care deține stocul
        pret pentru ziua precedenta.
        ■ Un câmp double de date numit currentPrice care stochează prețul stocului
        ora curentă.
        ■ builder care creează un stoc cu simbolul și numele specificate.
        ■ O metodă numită getChangePercent () care returnează procentul modificat
        de la precedentClosingPrice la currentPrice.*/

public class Stock {
    private String simbol;
    private String stoc;
    private double closingPrice;
    private double currentPrice;

    public Stock(String simbol, String stoc) {
        this.simbol = simbol;
        this.stoc = stoc;
    }

    public String getSimbol() {
        return simbol;
    }

    public void setSimbol(String simbol) {
        this.simbol = simbol;
    }

    public String getStoc() {
        return stoc;
    }

    public void setStoc(String stoc) {
        this.stoc = stoc;
    }

    public double getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(double closingPrice) {
        this.closingPrice = closingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent (){
        return currentPrice/closingPrice*100-100;
    }

}
