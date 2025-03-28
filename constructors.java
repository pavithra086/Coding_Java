package Practice_2;

public class constructors {
    private int id;
    private String name;

    public constructors(int id, String name) {
       //constructors(id)
        this.name = name;
    }
    public constructors(int id) {
        this.id = id;
        System.out.println("the id is"+id);
    }

    public static void main(String[] args) {

        constructors c = new constructors(1,"pavi");
    }
}

