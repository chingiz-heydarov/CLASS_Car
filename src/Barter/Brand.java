package Barter;

class Brand{
    Marka marka;
    Modelable model;
    Brand(Volkswagen_Models volkswagen_models ){
        this.marka=Marka.VOLKSWAGEN;
        this.model=volkswagen_models;
    }
    Brand(VolvoM volvoM){
        this.marka=Marka.VOLVO;
        this.model=volvoM;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "marka=" + marka +
                ", model=" + model +
                '}';
    }
}