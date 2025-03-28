package Practice_2;

import JavaConfidence.defaultmethodstesting.functinalinterfaces;

public interface functional_interface {
    void display();

    public static void main(String[] args) {

        functional_interface i =()->
        {
            System.out.println("hello");
        };
        i.display();
    }
}
