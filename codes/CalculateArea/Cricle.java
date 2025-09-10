package calculus;

public class Cricle implements Area {
    private double r;
    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public double getS()
    {
        return Math.PI * r*r;
    }
    public double getC()
    {
        return 2*Math.PI * r;
    }
}
