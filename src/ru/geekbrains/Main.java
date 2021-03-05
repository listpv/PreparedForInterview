package ru.geekbrains;

import ru.geekbrains.task1.Person;
import ru.geekbrains.task1.PersonBuilder;
import ru.geekbrains.task2.Lorry;
import ru.geekbrains.task3.Circle;
import ru.geekbrains.task3.Shape;
import ru.geekbrains.task3.Square;
import ru.geekbrains.task3.Triangle;

import java.util.Arrays;
import java.util.List;

// 1. Создать builder для класса Person со следующими полями:
// String firstName, String lastName, String middleName, String country,
// String address, String phone, int age, String gender.
//2. Описать ошибки в коде (см. задание в методичке) и предложить варианты оптимизации.
//3. Написать пример кода, который реализует принцип полиморфизма, на примере фигур — круг, квадрат, треугольник.

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Задание №1.");
        Person person = new PersonBuilder()
                .setFirstName("Bob")
                .setLastName("Trump")
                .setMiddleName("John")
                .setAddress("NY")
                .setCountry("USA")
                .setPhone("000000")
                .setAge(70)
                .setGender("Male")
                .build();
        System.out.println(person);
        System.out.println();

        System.out.println("Задание №2.");
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

        Lorry car = new Lorry();
        car.open();
        car.move();
        car.start();
        car.stop();
        System.out.println();

        System.out.println("Задание №3.");

        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape triangle = new Triangle();
        Shape square = new Square();

        List<Shape> geometry = Arrays.asList(shape, circle, triangle, square);

        for(Shape sh : geometry){
            sh.info();
        }
    }
}
