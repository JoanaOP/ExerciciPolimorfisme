import java.lang.Math.*;

public class Cercle extends Figura{
    private double r;

    public Cercle (double r){
        this.r = r;
    }

    public double area(){
        double area;
        area = Math.PI*Math.pow(r,2);
        return area;
    }
}
