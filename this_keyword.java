package Practice_2;

public class this_keyword {
    private int id;
    private String name;

    public this_keyword(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void dispalyemp(this_keyword emp)
    {
        System.out.println("id is"+emp.id + "and name is "+emp.name);
    }

    void show()
    {
        dispalyemp(this);
        emp(this);
    }

    private void emp(this_keyword this_keyword) {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        this_keyword t  =new this_keyword(1, "pavi");
        t.show();//this keyword can be used to call current class method
        //used to call constror


    }
}


