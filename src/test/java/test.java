import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {

    GestorFiguras g = new GestorFiguras();
    Figura[] vectorFigures = new Figura[4];

    @Before
    public void setUp(){

        TriangleEQ triangle = new TriangleEQ(2.5, 4);
        Rectangle rectangle = new Rectangle(3,5);
        Cercle cercle = new Cercle(2.5);
        Quadrat quadrat = new Quadrat(2);

        vectorFigures[0] = triangle;
        vectorFigures[1] = rectangle;
        vectorFigures[2] = cercle;
        vectorFigures[3] = quadrat;

    }

    @Test
    public void sumaTest(){

        Assert.assertEquals(5,vectorFigures[0].area(),0);
        Assert.assertEquals(15,vectorFigures[1].area(),0);
        Assert.assertEquals(19.635,vectorFigures[2].area(),0.5);
        Assert.assertEquals(4,vectorFigures[3].area(),0);
        Assert.assertEquals(43.63,g.suma(vectorFigures),0.5);

    }

    @Test
    public void sortTest(){

        Figura[] expected = new Figura[4];
        expected[0] = vectorFigures[3];
        expected[1] = vectorFigures[0];
        expected[2] = vectorFigures[1];
        expected[3] = vectorFigures[2];

        g.sort(vectorFigures);

        Assert.assertEquals(expected,vectorFigures);

    }

}
