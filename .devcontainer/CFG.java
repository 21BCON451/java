//package com.company;
  interface Vehicle{
      void changeGear(int a);
      void speedUp(int a);
      void speedBrake(int a);

  }
  class Bicycle implements Vehicle {
      int speed;
      int gear;
      public void changeGear(int newGear){
          gear = newGear;
      }
      public void speedUp(int increment){
          speed = speed + increment;
      }
      public void speedBrake(int decrement){
          speed = speed - decrement;
      }
      public void printStates(){
          System.out.println("speed" +speed);
          System.out.println("gear" +gear);
      }
  }
  class Bike implements Vehicle{
      int speed;
      int gear;
      public void changeGear(int newGear){
          gear = newGear;
      }
      public void speedUp(int increment){
          speed = speed + increment;
      }
      public void speedBrake(int decrement){
          speed = speed - decrement;
      }
      public void printStates(){
          System.out.println("speed" +speed);
          System.out.println("gear" +gear);
      }
  }
public class CFG {
    public static void main(String[] args) {
    Bicycle b1 =new Bicycle();
    b1.changeGear(2);
    b1.speedUp(5);
    b1.speedBrake(3);
     b1.printStates();
    Bike b2 = new Bike();
        b2.changeGear(3);
        b2.speedUp(4);
        b2.speedBrake(3);
        b2.printStates();
    }
}
