package UFF.test;

public class Test01 {
    private int a;
    public double b;

    public Test01(int first, double second)
    {
        this.a = first;
        this.b = second;
    }
    public static void main(String[] args)
    {
        Test01 c1 = new Test01(10, 20.5);
        Test01 c2 = new Test01(10, 31.5);
        c2 = c1;
        c1.a = 2;
        System.out.println(c2.a);
    }
}
