public abstract class Figura implements Comparable<Figura> {

    public abstract double area();

    public int compareTo(Figura f){
        int result = (int) (this.area()-f.area());
        return result;
    }

}
