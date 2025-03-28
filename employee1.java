package Practice_2;

public class employee1 extends empoyee{
    private int id;
    private String sal;

    public static void main(String[] args) {
        employee1 e = new employee1();
        e.setId(1);
        e.setName("pavna");
        System.out.println(e.getName()+" " +e.getId());
        empoyee e1 = new empoyee();
        e1.setName("rav");
        System.out.println(e1.getName());
    }
}
