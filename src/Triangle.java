// Bangun datar segitiga
public class Triangle {
    private double bottom;
    private double height;

    public Triangle(){
        this.bottom = 0;
        this.height = 0;
    }

    public Triangle(double inBottom, double inHeight){
        this.bottom = inBottom;
        this.height = inHeight;
    }

    public double getBottom() {
        return bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double Surround(){
        double val;
        double tempBottom = this.getBottom();
        val = tempBottom * 3;
        return val;
    }

    public double Face(){
        double val;
        double tempBottom = this.getBottom();
        double tempHeight = this.getHeight();
        val = (0.5)*tempBottom*tempHeight;
        return val;
    }
}