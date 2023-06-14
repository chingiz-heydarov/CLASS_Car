package SKILLBOX.modul3;


public class Main5 {
    public static void main(String[] args) {
        Cargo piano = new Cargo(new Dimensions(1.3, 0.5, 1.8), 150,
                "Old Trafford", "0432ACV", false, false);

        Cargo fortepiano = piano.addresChanger("Ettihad Staduim");

        System.out.println("Адрес доставки пианино - " + piano.getAddress() + " ,адрес доставки фортепьяно - " + fortepiano.getAddress());

        Cargo car= piano.dimensionsChanger(new Dimensions(1.7,2.0,5.2));

        System.out.println("Объемы упаковки пианино - "+piano.getDimensions().calculator()+" кубометров, объемы упаковки автомобиля - "+
                car.getDimensions().calculator()+" кубометров.");

        Cargo table = piano.weightChanger(25);

        System.out.println("Вес пианино - "+piano.getWeight()+" кг, а вес стола - "+table.getWeight()+" кг.");
    }
}
