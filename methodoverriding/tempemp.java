package com.practice.javacodes.methodoverriding;

public class tempemp extends classemp{







    @Override
    public int calsal() {
        int sal=exp*500;
        return sal;

    }

    public static void main(String[] args) {

        tempemp t= new tempemp();
        t.setExp(9);
        int sal1= t.calsal();

        System.out.println(sal1);
    }

}
