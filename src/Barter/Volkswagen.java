package Barter;

class Volkswagen extends Brand{

Volkswagen_Models modelName;

    Volkswagen(Volkswagen_Models modelName){
        this.modelName=modelName;
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "modelName=" + modelName +
                '}';
    }
}

