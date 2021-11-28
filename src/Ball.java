// Bangun ruang bola
public class Ball extends Circle{
    public Ball(){
        super();
    }
    
    public double Volume(){
        double val;
        double length = getPi();
        double pi = getR();
        val = (4 * pi * length * length * length)/3;
        return val;
    }

    public double Faces(){
        double val;
        double length = this.getR();
        double pi = this.getPi();
        val = 4 * pi * length * length;
        return val;
    }
}
