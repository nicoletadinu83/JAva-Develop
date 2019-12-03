package ex4_Produs;

import java.util.Date;

public class Perisable extends Produs {
    private String dataFabricatiei;
    private String dataExpirare;


    public Perisable(double price, String nume, String productor, UnitateDeMasura unitateDeMasura) {
        super(price, nume, productor, unitateDeMasura);
    }

    public Perisable(double price, String nume, String productor, UnitateDeMasura unitateDeMasura,
                     String dataFabricatiei, String dataExpirare) {
        super(price, nume, productor, unitateDeMasura);
        this.dataFabricatiei = dataFabricatiei;
        this.dataExpirare = dataExpirare;
    }

    public String getDataFabricatiei() {

        return dataFabricatiei;
    }

    public void setDataFabricatiei(String dataFabricatiei) {
        this.dataFabricatiei = dataFabricatiei;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }
}
