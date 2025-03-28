package Practice_2;

public class test_exception {
   public void addition()throws  ArithmeticException
   {
       try{
           int a =0; int b=1;
           System.out.println(b/a); throw new ArithmeticException("this is not allowed");
       }catch(NullPointerException e)
       {
           System.out.println(e.getMessage());
       }
       catch (ArithmeticException e1  )
       {
           System.out.println(e1.getMessage());
       }
       catch (Exception  e  )
       {
           System.out.println();
       }
       finally {
           System.out.println("i am executed");
       }
   }

    public static void main(String[] args)throws  ArithmeticException {
        test_exception t = new test_exception();
        t.addition();
    }
}
