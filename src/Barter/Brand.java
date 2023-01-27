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

    Brand(HondaM hondaM){
        this.marka=Marka.HONDA;
        this.model=hondaM;
    }

    Brand(InfinitiM infinitiM){
        this.marka=Marka.INFINITI;
        this.model=infinitiM;
    }

    Brand(BmwM bmwM){
        this.marka=Marka.BMW;
        this.model=bmwM;
    }

    Brand(Audi_Models audi_models){
        this.marka=Marka.AUDI;
        this.model=audi_models;
    }

    Brand(Toyota_Models toyota_models){
        this.marka=Marka.TOYOTA;
        this.model=toyota_models;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "marka=" + marka +
                ", model=" + model +
                '}';
    }
}