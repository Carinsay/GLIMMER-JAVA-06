package calculus;

public class Rectangle {
    private double m,n;

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getS()
    {
        return m*n;
    }
    public double getC()
    {
        return 2*(m+n);
    }
}
