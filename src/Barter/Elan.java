package Barter;



import java.time.LocalDate;

public class Elan {

    int number;
    Brand_Name brand_name;
    int year;
    double engine_size;
    boolean auto_gearbox;
    Body kuzov;
    boolean awd;
    int price;
    int mileage;

    Elan(int number, Brand_Name brand_name,int year, double engine_size,Body kuzov,boolean awd,int price,int mileage, boolean auto_gearbox){
        this.number=number;
        this.auto_gearbox=auto_gearbox;
        this.brand_name=brand_name;
        if(year>1970 && year<2023) {
            this.year = year;
        }
        else System.out.println("Wrong year");
        this.kuzov=kuzov;
        this.awd=awd;
        if(price>0) {
            this.price = price;
        }
        if(engine_size>0.1 && engine_size<8.0) {
            this.engine_size = engine_size;
        }
        this.mileage=mileage;
    }
}

enum Brand_Name{
    VOLKSWAGEN{
        Volkswagen_Models volkswagen_models;
    },
    TOYOTA,
    AUDI;
    Volkswagen_Models volkswagen_models;
    Audi_Models audi_models;
    Toyota_Models toyota_models;

}


enum Volkswagen_Models{
    GOLF,TIGUAN,JETTA,PASSAT,TOURAN,SHARAN,TOUAREG,MULTIVAN,TRANSPORTER,PHAETON,ATLAS,POLO,GOLF_R,GOLF_GTI,CARAVELLE,AMAROK,ARTEON,CC,BEETLE,CADDY,SCIROCCO,TAOS;
}

enum Audi_Models{
    A1,A2,A3,A4,A5,A6,A7,A8,S1,S3,S4,S5,S6,S7,S8,RS3,RS4,RS5,RS6,RS7,S8_PLUS,Q2,Q3,Q4,Q5,Q7,Q8,RSQ3,RSQ5,RSQ8,ALLROAD_A4,ALLROAD_A6,R8,TT,TTS,TTRS;
}

enum Toyota_Models{
    CHASER,MARK_2,ARISTO,CRESTA,MAJESTA,CROWN,CELSIOR,VENZA,SUPRA,TUNDRA,SEQUOIA,RAV4,PRIUS,YARIS,YARIS_GR,PRADO,LAND_CRUISER,CAMRY,AVALON,COROLLA,HIGHLANDER,HILUX,FORTUNER,CORONA,AVENSIS,ALPHARD,C_HR,CELICA,GT86,HARRIER,FJ_CRUISER,VITZ,CARINA,CALDINA;
}

enum Body{
    SEDAN,UNIVERSAL,LIFTBEK,XETCHBEK,KABRIOLET,RODSTER,MINIVEN,SUV,LIMUZIN,FASTBEK,KUPE,VAN,FURQON,PIKAP;
}
