package Practice_2;

public class recursion {
    public int id;

    @Override
    public String toString() {
        return "recursion{" +
                "id=" + id +
                '}';
    }

    void printnos(int i )
    {
            System.out.println(i);
            i++;
            if(i>11)
            {
              return;
            }
            printnos(i);
        }

    public static void main(String[] args) {
        recursion res = new recursion();
        res.printnos(0);
        System.out.println(res.toString());
        String id = res.toString();
        System.out.println(id);
    }
    }

