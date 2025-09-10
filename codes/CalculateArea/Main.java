package calculus;

public class Main {
    public static void main(String[] args) {
        //圆的部分
        Cricle a = new Cricle();
        a.setR(7);
        double S = a.getS();
        double C = a.getC();
        System.out.println("圆的面积(半径7:："+S+" "+"周长"+C);
        //三角形部分
        Triangle s = new Triangle();
        s.setA(3);s.setB(5);s.setc(6);
        System.out.println("三角形面积(边长3/5/6):"+s.getS()+" "+"周长"+s.getC());
        //矩形部分
        Rectangle t =new Rectangle();
        t.setM(7);t.setN(3);
        System.out.println("矩形面积(边长7/3):"+t.getS()+" "+"周长"+t.getC());
    }
}
