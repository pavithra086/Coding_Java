package Practice_2;

public class exceptionpropogation {
    public void method1()
    {
        int a=0; int b=1;
        System.out.println(b/a);
    }
    public void method2()
    {
        method1();
    }
    public void method3()
    {
        try
        {
            method2();
        }catch(ArithmeticException e)
        {
            System.out.println("invalid math op");
        }

    }

    public static void main(String[] args) {
        exceptionpropogation t = new exceptionpropogation();
            t.method3();
    }
}
