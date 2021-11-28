// Bangun ruang pyramid
public class Pyramid extends Triangle{
    private double t;

    public Pyramid(){
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
        double faceval = this.Face();
        double surval = this.Surround();
        double tempt = this.getT();
        val = (faceval * 2) + (tempt * surval);
        return val;
    }
}
