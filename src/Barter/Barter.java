package Barter;

public class Barter {

   Brand barter_brand;
    Body kuzov;
    double engine_size;

    FuelType fuelType;

    boolean auto_gearbox;

    Barter(Brand brand, Body kuzov, double engine_size,  boolean auto_gearbox,FuelType fuelType){
     this.auto_gearbox=auto_gearbox;
     this.barter_brand=brand;
     this.engine_size=engine_size;
     this.fuelType=fuelType;
     this.kuzov=kuzov;
    }

 @Override
 public String toString() {
  return "Barter{" +
          "barter_brand=" + barter_brand +
          ", kuzov=" + kuzov +
          ", engine_size=" + engine_size +
          ", fuelType=" + fuelType +
          ", auto_gearbox=" + auto_gearbox +
          '}';
 }
}
