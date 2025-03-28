package Practice_2;

import static Practice_2.ststic_features.inner.sal;

public class ststic_features {//java does not allow top level classes to be ststic
    static int id;

    public void normal()
    {
        System.out.println("hi");
    }
    public static void dis_id()
    {
        System.out.println("am a new employer here");
    }
    static class inner {
        static int sal=20000;
        void show()
        {
            System.out.println("hi from inner class");
        }

    }

    public static void main(String[] args) {
        dis_id();
        System.out.println(sal);
    }

}
