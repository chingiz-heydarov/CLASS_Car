package SKILLBOX.modul3;

import com.noyabr29.Car;

public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final String regNumber;
    private final boolean isFragile;
    private final boolean isConvertable;

    public Cargo(Dimensions dimensions, int weight, String address, String regNumber, boolean isFragile, boolean isConvertable) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.regNumber = regNumber;
        this.isFragile = isFragile;
        this.isConvertable = isConvertable;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public Cargo addresChanger(String newAddress) {
        return new Cargo(dimensions, weight, newAddress, regNumber, isFragile, isConvertable);
    }

    public Cargo dimensionsChanger(Dimensions newDimensions){
        return new Cargo(newDimensions, weight,address,regNumber,isFragile,isConvertable);
    }

    public Cargo weightChanger(int newWeight){
        return new Cargo(dimensions,newWeight,address,regNumber,isFragile,isConvertable);
    }
}
