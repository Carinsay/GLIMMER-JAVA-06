package calculus;

public class Triangle implements Area {
    private double a,b,c;
//这是getter和setter
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getc() {
        return c;
    }

    public void setc(double c) {
        this.c = c;
    }

    public double getS()
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double getC()
    {
        return a+b+c;
    }

}
