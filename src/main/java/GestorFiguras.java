import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;


public class GestorFiguras {

    static double suma(Figura[] listFigures){
        double sumaAreas = 0;

        for(Figura figura : listFigures){
            sumaAreas = sumaAreas + figura.area();
        }
        return sumaAreas;
    }

    static void sort(Figura[] listFigures){

        Arrays.sort(listFigures);

    }


    public static void main(String []args){

        TriangleEQ triangle = new TriangleEQ(2.5, 4);
        Rectangle rectangle = new Rectangle(3,5);
        Cercle cercle = new Cercle(2.5);
        Quadrat quadrat = new Quadrat(2);

        System.out.println("La area del triangle es: " + triangle.area());
        System.out.println("La area del rectangle es: " + rectangle.area());
        System.out.println("La area del cercle es: " + cercle.area());
        System.out.println("La area del quadrat es: " + quadrat.area());

        Figura[] vectorFigures = new Figura[4];
        vectorFigures[0] = triangle;
        vectorFigures[1] = rectangle;
        vectorFigures[2] = cercle;
        vectorFigures[3] = quadrat;

        System.out.println("La suma de les arees es: " + suma(vectorFigures));
        sort(vectorFigures);
        System.out.println("Arees ordenades: ");
        for(Figura f : vectorFigures) {
            System.out.println(f.area());
        }

    }

}
