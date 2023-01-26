package Barter;

class Audi extends Brand{

    Marka marka;
    Audi_Models modelName;
    Audi(Audi_Models modelName){
        this.modelName=modelName;
        this.marka=Marka.AUDI;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "marka=" + marka +
                ", modelName=" + modelName +
                '}';
    }
}

