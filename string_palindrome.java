package org.example.happy_practice;

public class string_palindrome {
    public static void main(String[] args) {
        String str= "pavvap";
        boolean res = pln(str);
        System.out.println(res);
    }
    public static boolean pln(String name)
    {
        StringBuilder sb = new StringBuilder(name);

        StringBuilder sb1=new StringBuilder(name);
        sb1.reverse();
        System.out.println(sb1);
        System.out.println(sb);

       String a= sb.toString();
       String b = sb1.toString();
        if(a.equals(b))
        {
            return true;
        }
        else {
            return false;
        }


    }
}
