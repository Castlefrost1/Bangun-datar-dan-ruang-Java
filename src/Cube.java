// Bangun ruang kubus
public class Cube extends Square{
    private double t;

    public Cube(){
        super();
        this.t = 0;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double Volume(){
        double val;
        double faceval = this.Face();
        double tempt = this.getT();
        val = faceval * tempt;
        return val;
    }

    public double Faces(){
        double val;
        double tempT = getT();
        double tempS1 = getS1();
        double tempS2 = getS2();
        val = (2 * tempT * tempS1) + (2 * tempT * tempS2) + (2 * tempS1 * tempS2);
        return val;
    }
}
