package org.example.challenge3;

public class tostring_impo {
    public String name;
    public int age;

    tostring_impo(String name,int age){
        this.name=name;
        this.age=age;

    }

    @Override
    public String toString() {
        return "tostring_impo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        tostring_impo t= new tostring_impo("pavi",8);
        System.out.println(t);
        String h="he";int age =0;
        System.out.printf("hello %d  your names is %s",age,h);
    }
}
