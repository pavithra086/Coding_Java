package Practice_2;

public class strings {
    String str = "pavi";

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("pavi");
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb instanceof StringBuilder);
    }
}
