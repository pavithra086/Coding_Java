package Practice_2;

public class empoyee {
    private int id;
    private String name;
    private int sal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }
    private int cal_sal(){
        sal=5000;
        return sal;
    }

    public static void main(String[] args) {
        empoyee e = new empoyee();

        e.setId(1);
       // e.setName("pavi");
        int sal = e.cal_sal();
        System.out.println(sal);
        System.out.println(e.getName());



    }
}
