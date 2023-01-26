package Barter;

public class Infiniti extends Brand{

    InfinitiM infinitiModels;
    Marka marka;
    Infiniti(InfinitiM infm){
        this.infinitiModels=infm;
        this.marka=Marka.INFINITI;
    }

    @Override
    public String toString() {
        return "Infiniti{" +
                "infinitiModels=" + infinitiModels +
                ", marka=" + marka +
                '}';
    }
}
