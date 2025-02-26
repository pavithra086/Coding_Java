package org.example.happy_practice;



public class reverse_string {
    public static void main(String[] args) {
        String name="hello";
        StringBuilder sb = new StringBuilder(name);
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb.reverse());
        for(int i=name.length()-1;i>=0;i--)
        {
            sb1.append(name.charAt(i)).append(9);
        }
        System.out.println(sb1);
        sb.deleteCharAt(4);

    }
}
