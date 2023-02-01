package Barter;

class Brand{
    Marka marka;
    Modelable model;


    Brand(Volkswagen_Models volkswagen_models ){
        this.marka=Marka.VOLKSWAGEN;
        this.model=volkswagen_models;
    }
    Brand(Volvo_Models Volvo_Models){
        this.marka=Marka.VOLVO;
        this.model=Volvo_Models;
    }

    Brand(Honda_Models hondaM){
        this.marka=Marka.HONDA;
        this.model=hondaM;
    }

    Brand(Infiniti_Models Infiniti_Models){
        this.marka=Marka.INFINITI;
        this.model=Infiniti_Models;
    }

    Brand(Bmw_Models bmwM){
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

    Brand(Mercedes_Models mercedes_models ) {
        this.marka = Marka.MERCEDES;
        this.model = mercedes_models;
    }



    @Override
    public String toString() {
        return "Brand{" +
                "marka=" + marka +
                ", model=" + model +
                '}';
    }
}