package basic.c08_oop;

import java.util.ArrayList;

/*
Clase 6 - Clases, encapsulamiento y herencia (14/05/2025)
Vídeo: https://www.twitch.tv/videos/2459212698
*/

public class ClassesExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        Book book = new Book("El Principito", "Antoine de Saint-Exupéry");
        book.showData();

        // 2. Crea una clase Dog (subclase de Animal) con un método bark() que imprima su sonido.
        Dog dog = new Dog("Fido");
        dog.speak();
        dog.bark();

        // 3. Ya añadimos un constructor a la clase Book que reciba title y author.

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        Car car = new Car("Toyota", "Corolla");
        car.showData();

        // Ejemplo de herencia: ElectricCar extiende Car
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", 75);
        tesla.showData();
        tesla.showBatteryCapacity();

        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (>=60).
        Student student = new Student(75);
        System.out.println("Student passed: " + student.passed());

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        System.out.println("New balance: " + account.getBalance());

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        Worker worker = new Worker("John Doe", 3000);
        worker.showSalary();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        PersonList personList = new PersonList();
        personList.addPerson(new Person("Alice", 30));
        personList.addPerson(new Person("Bob", 25));
        personList.showPersons();

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        Product product = new Product("Laptop", 1000);
        product.applyDiscount(0.2);
        System.out.println("Discounted price: " + product.getPrice());
    }
}

// 1 & 3. Clase Book con encapsulamiento
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void showData() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// 2. Clase Animal y subclase Dog demostrando herencia
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

// 4. Clase Car con herencia para ElectricCar
class Car {
    private String brand;
    private String model;

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() { return brand; }
    public String getModel() { return model; }

    public void showData() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class ElectricCar extends Car {
    private int batteryCapacity; // kWh

    public ElectricCar(String brand, String model, int batteryCapacity) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
    }

    public void showBatteryCapacity() {
        System.out.println("Battery capacity: " + batteryCapacity + " kWh");
    }
}

// 5. Clase Student
class Student {
    private int score;

    public Student(int score) {
        this.score = score;
    }

    public boolean passed() {
        return score >= 60;
    }
}

// 6. Clase BankAccount
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() { return balance; }
}

// 7. Clase Rectangle
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}

// 8. Clase Worker
class Worker {
    private String name;
    private double salary;

    public Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void showSalary() {
        System.out.println(name + "'s salary: " + salary);
    }
}

// 9. Clase Person y PersonList
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

class PersonList {
    private ArrayList<Person> persons = new ArrayList<>();

    public void addPerson(Person person) {
        persons.add(person);
    }

    public void showPersons() {
        for (Person p : persons) {
            System.out.println("Name: " + p.getName() + ", Age: " + p.getAge());
        }
    }
}

// 10. Clase Product con descuento
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double discount) {
        if (discount >= 0 && discount <= 1) {
            price = price * (1 - discount);
        }
    }

    public double getPrice() { return price; }
}

