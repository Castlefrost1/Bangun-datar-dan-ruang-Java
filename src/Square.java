// Bangun datar persegi
public class Square {
    private double s1;
    private double s2;

    public Square(){
        this.s1 = 0;
        this.s2 = 0;
    }

    public Square(double inS1, double inS2){
        this.s1 = inS1;
        this.s2 = inS2;
    }

    public double getS1() {
        return s2;
    }

    public double getS2() {
        return s1;
    }

    public void setS1(double s1) {
        this.s1 = s1;
    }

    public void setS2(double s2) {
        this.s2 = s2;
    }

    public double Surround(){
        double val;
        double tempS1 = getS1();
        double tempS2 = getS2();
        val = tempS1 * 2 + tempS2 * 2;
        return val;
    }

    public double Face(){
        double val;
        double tempS1 = getS1();
        double tempS2 = getS2();
        val = tempS1 * tempS2;
        return val;
    }
}
