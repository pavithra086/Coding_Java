package com.practice.javacodes.methodoverriding;

public class classemp {
    public int empid;
    public int exp;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    public int calsal(){
        int sal= exp*1000;
        return sal;
    }

    public static void main(String[] args) {
        classemp c= new classemp();
        c.setExp(7);
    }
}
