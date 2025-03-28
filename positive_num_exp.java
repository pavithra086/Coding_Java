package Practice_2;



class positive extends Exception{
    public positive(String mess) {
        super(mess);
    }
}
public class positive_num_exp {
    public static void checknum(int num)
    {
        try
        {
            if(num<0) throw new positive("not valid number");
        }
        catch (positive e )
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        checknum(-9);
    }

}
