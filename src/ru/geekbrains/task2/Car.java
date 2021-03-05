package ru.geekbrains.task2;

abstract public class Car {

    public Engine engine;
    private String color;
    private String name;


    public void start() {
        System.out.println("Car starting");
    }

    abstract void open();

//    protected void open() {
//        System.out.println("Car is open");
//    }
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
