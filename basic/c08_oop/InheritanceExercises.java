package basic.c08_oop;

import java.util.ArrayList;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class InheritanceExercises {
    public static void main(String[] args) {
        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        Car car = new Car();
        car.move();
        car.honk();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        Student student = new Student("Ana", 20, 9.5);
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.makeSound();
        cat.makeSound();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        Manager manager = new Manager("Carlos", 5000, "Ventas");
        System.out.println(manager);

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Área del círculo: " + circle.calculateArea());
        System.out.println("Área del rectángulo: " + rectangle.calculateArea());

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        Bird eagle = new Eagle();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        Phone phone = new Phone();

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(500);
        sa.withdraw(200);
        sa.addInterest();
        System.out.println("Saldo final: " + sa.getBalance());

        // 9. Crea una clase Vehicle y tres subclases: Car2, Bike y Truck, cada una con un método describe() sobrescrito.
        Vehicle car2 = new Car2();
        Vehicle bike = new Bike();
        Vehicle truck = new Truck();
        car2.describe();
        bike.describe();
        truck.describe();

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Bird());
        for (Animal a : animals) {
            a.makeSound();
        }
    }
}

// Ejercicio 1
class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving");
    }

    public void describe() {
        System.out.println("Generic vehicle");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car goes beep beep!");
    }
}

// Ejercicio 2
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    private double grade;

    public Student(String name, int age, double grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println(name + " is studying with grade: " + grade);
    }
}

// Ejercicio 3
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Ejercicio 4
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{name='" + name + "', salary=" + salary + ", department='" + department + "'}";
    }
}

// Ejercicio 5
abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        this.width = w;
        this.height = h;
    }

    public double calculateArea() {
        return width * height;
    }
}

// Ejercicio 6
class Bird extends Animal {
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Tweet");
    }
}

class Eagle extends Bird {
    @Override
    public void fly() {
        super.fly();
        System.out.println("Eagle is soaring high");
    }
}

// Ejercicio 7
class Device {
    public Device() {
        System.out.println("Device created");
    }
}

class Phone extends Device {
    public Phone() {
        super();
        System.out.println("Phone ready");
    }
}

// Ejercicio 8
class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Depositado: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Retirado: " + amount);
        } else {
            System.out.println("Fondos insuficientes");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.05;

    public SavingsAccount(double balance) {
        super(balance);
    }

    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        System.out.println("Interés añadido: " + interest);
    }
}

// Ejercicio 9
class Car2 extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a car");
    }
}

class Bike extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a bike");
    }
}

class Truck extends Vehicle {
    @Override
    public void describe() {
        System.out.println("This is a truck");
    }
}

// Ejercicio 10
class Vehicle2 {
    public void move() {
        System.out.println("The vehicle is moving");
    }
}