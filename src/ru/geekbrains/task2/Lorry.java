package ru.geekbrains.task2;

//  Решения задания №2:
//  -- данный вариант;
//  -- public class Lorry extends LightWeightCar implements Stopable{
//   @Override
//    public void stop() {
//        System.out.println("Car is stop");
//    }
//   }
//  -- либо в классе Car вместо
//  abstract void open();
//  protected void open() {
//        System.out.println("Car is open");
//    }
//  ,тогда
//  public class Lorry extends Car implements Moveable, Stopable и
//   как в методичке.


public class Lorry extends Car implements Moveable, Stopable {

    @Override
    public void open() {
        System.out.println("Car is open");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stop");

    }
}
