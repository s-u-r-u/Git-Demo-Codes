package SURUSURAJ.com;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add(2, 3);
        arithmetic.sub(3,2);
        arithmetic.mul(3,6);
        arithmetic.div(6,2);
        System.out.println("Addition of 2 and 3 =" + arithmetic.add(2, 3));
        System.out.println("Substraction of 3 by 2 =" + arithmetic.sub(3, 2));
        System.out.println("Multiplication of 3 and 6 =" + arithmetic.mul(3, 6));
        System.out.println("Division of 6 by 2 =" + arithmetic.div(6, 2));
    }
    public int add(int a, int b)
    {
        return a + b;
    }
    public int sub(int c, int d)
    {
        return c-d;
    }
    public int mul(int e, int f)
    {
        return e*f;
    }
    public int div(int g, int h)
    {
        return g/h;
    }
}
