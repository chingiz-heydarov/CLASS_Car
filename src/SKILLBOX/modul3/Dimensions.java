package SKILLBOX.modul3;

public class Dimensions {
    private final double height;
    private final double width;
    private final double length;

    public Dimensions(double height, double width, double length){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    public double calculator(){
        return height*width*length;
    }
}
