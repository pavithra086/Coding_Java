package Practice_2;

public interface employee_interface {
    void cal_sal();
    void dis_performance();
   default void print_hi()
   {
       System.out.println("hi");
       calsal();
   }
   static void print_hello(){
       System.out.println("hello");

   }
   private void calsal()
   {

   }
}
