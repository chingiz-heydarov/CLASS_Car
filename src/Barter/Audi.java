package Barter;

class Audi extends Brand{
    Audi_Models modelName;
    Audi(String brandName, Audi_Models modelName){
        Brand.brandName =brandName;
        this.modelName=modelName;
    }
}

