package Practice_2;

class age_valid extends  Exception{
    public  age_valid(String message)
    {
        super(message);
    }

    public static class custom_exp {
     public  void ready_to_vote()
      {
          int  age =9;
          try
          {if(age<9)
          {
              throw new age_valid("this is not valid");
          }}
          catch(Exception e)
              {
                  System.out.println(e);
              }
      }

        public static void main(String[] args) {
            custom_exp exp = new custom_exp();
            exp.ready_to_vote();
        }
    }
}
