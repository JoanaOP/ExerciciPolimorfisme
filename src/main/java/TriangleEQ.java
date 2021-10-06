public class TriangleEQ extends Figura {
    private double b;
    private double h;


    public TriangleEQ(double b, double h){
        this.b = b;
        this.h = h;
    }

    public double area() {
        double area;
        area = (b * h) / 2;
        return area;
    }
}
