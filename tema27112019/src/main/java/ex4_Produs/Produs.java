package ex4_Produs;

public class Produs {
     private double price;
     private String nume;
     private String code;
     private String productor;
     private UnitateDeMasura unitateDeMasura;

     public Produs(double price, String nume, String productor, UnitateDeMasura unitateDeMasura) {
          this.price = price;
          this.nume = nume;
          this.productor = productor;
          this.unitateDeMasura = unitateDeMasura;
     }

     public double getPrice() {
          return price;
     }

     public void setPrice(double price) {
          this.price = price;
     }

     public String getNume() {
          return nume;
     }

     public void setNume(String nume) {
          this.nume = nume;
     }

     public String getCode() {
          return code;
     }

     public void setCode(String code) {
          this.code = code;
     }

     public String getProductor() {
          return productor;
     }

     public void setProductor(String productor) {
          this.productor = productor;
     }

     public UnitateDeMasura getUnitateDeMasura() {
          return unitateDeMasura;
     }

     public void setUnitateDeMasura(UnitateDeMasura unitateDeMasura) {
          this.unitateDeMasura = unitateDeMasura;
     }
}
