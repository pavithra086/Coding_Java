package com.practice.javacodes.loosecoupling;

public class car  {
 engine e;
 car(engine e)
 {
     this.e=e;
 }


        public void move()
        {
            System.out.println("car is");
            e.show();
        }




}
