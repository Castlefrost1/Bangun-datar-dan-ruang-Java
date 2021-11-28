// Bangun datar lingkaran
public class Circle {
    private double length;
    private final double pi = 3.14159;

    public Circle(){
        this.length = 0;
    }

    public Circle(double inr){
        this.length = inr;
    }

    public double getR() {
        return length;
    }

    public double getPi() {
        return pi;
    }

    public void setR(double r) {
        this.length = r;
    }

    public double Surround(){
        double val;
        double length = getR();
        double pi = getPi();
        val = length * 2 * pi;
        return val;
    }

    public double Face(){
        double val;
        double length  = getR();
        double pi = getPi();
        val = length * length * pi;
        return val;
    }
}
