package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/


public class AbstractionExercises {

    public static void main(String[] args) {

        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área.

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        System.out.println("Area del circulo: " + circle.calculateArea());
        System.out.println("Area del rectangulo: " + rectangle.calculateArea());

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
        Playable guitar = new Guitar();
        Playable piano = new Piano();
        guitar.play();
        piano.play();

        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeSound();
        }

        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
        Drawable[] shapes = {new Circle(), new Square(), new Triangle()};
        for (Drawable shape : shapes) {
            shape.draw();
        }   


        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
        Employee fullTimeEmployee = new FullTimeEmployee();
        Employee partTimeEmployee = new PartTimeEmployee();
        System.out.println("Salario del empleado full time: " + fullTimeEmployee.calculateSalary());
        System.out.println("Salario del empleado part time: " + partTimeEmployee.calculateSalary());


        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
        Movable car = new Car();
        Movable robot = new Robot();
        car.move();
        robot.move();

        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
        Appliance tv = new TV();
        Appliance washingMachine = new WashingMachine();
        tv.turnOn();
        washingMachine.turnOff();


        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
        Duck duck = new Duck();
        duck.fly();
        duck.swim();


        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
        Document pdfDocument = new PDFDocument();
        Document wordDocument = new WordDocument();
        pdfDocument.print();
        wordDocument.print();

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
        Payable invoice = new Invoice();
        Payable employeePayment = new EmployeePayment();
        invoice.pay();
        employeePayment.pay();
        
    }
}


        // 1. Crea una clase abstracta Shape con el método calculateArea(). Luego implementa dos subclases: Circle y Rectangle, y haz que cada una calcule su propia área
        
        
abstract class  Shape {
    abstract double calculateArea();
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double calculateArea() {
        return width * height;
    }
}

        // 2. Crea una interfaz Playable con el método play(). Luego implementa esa interfaz en dos clases: Guitar y Piano. Cada una debe mostrar un mensaje diferente al ejecutarse.
interface Playable {
    void play();
}
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing guitar");
    }
}
class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing piano");
    }
}



        // 3. Define una clase abstracta Animal con el método makeSound(). Implementa Dog y Cat para que hagan sonidos distintos. Crea un array de Animal para mostrar polimorfismo.
abstract class Animal {
    abstract void makeSound();
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}


        // 4. Crea una interfaz Drawable. Implementa las clases Circle, Square, y Triangle que muestren cómo se dibuja cada figura usando draw().
interface Drawable {
    void draw();
}
class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }
}
class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
}
class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
    }
class Car {
    public void drive() {
        System.out.println("Driving a car");
    }
}

        // 5. Crea una clase abstracta Employee con un método calculateSalary(). Implementa FullTimeEmployee y PartTimeEmployee con lógica diferente para calcular el salario.
abstract class Employee {
    abstract double calculateSalary();
}
class FullTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 5000.0;
    }
}
class PartTimeEmployee extends Employee {
    @Override
    double calculateSalary() {
        return 2500.0;
    }
}
class Robot {
    public void move() {
        System.out.println("Moving a robot");
    }
}


        // 6. Crea una interfaz Movable con el método move(). Haz que las clases Car y Robot implementen ese método con comportamientos diferentes.
interface Movable {
    void move();
}
class Car implements Movable {
    @Override
    public void move() {
        System.out.println("Car is moving");
    }   
}
        // 7. Crea una clase abstracta Appliance con método turnOn() y turnOff(). Implementa TV y WashingMachine con mensajes diferentes al encender y apagar.
abstract class Appliance {
    abstract void turnOn(); 
    abstract void turnOff();
}
class TV extends Appliance {
    @Override
    void turnOn() {
        System.out.println("TV is turning on");
    }
    @Override
    void turnOff() {
        System.out.println("TV is turning off");
    }
}
class WashingMachine extends Appliance {
    @Override
    void turnOn() {
        System.out.println("Washing machine is turning on");
    }
    @Override
    void turnOff() {
        System.out.println("Washing machine is turning off");
    }
}
class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying");               
    }
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
        // 8. Crea dos interfaces Flyable y Swimmable. Crea una clase Duck que implemente ambas interfaces y muestre cómo puede volar y nadar.
interface Flyable {
    void fly();
}
interface Swimmable {
    void swim();
}



        // 9. Crea una clase abstracta Document con el método print(). Luego crea PDFDocument y WordDocument, cada una con su forma de imprimir.
abstract class Document {
    abstract void print();
}
class PDFDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing PDF document");
    }
}
class WordDocument extends Document {
    @Override
    void print() {
        System.out.println("Printing Word document");
    }
}

        // 10. Crea una interfaz Payable con el método pay(). Luego implementa las clases Invoice y EmployeePayment, cada una mostrando un mensaje de pago diferente.
interface Payable {
    void pay();
}
class Invoice implements Payable {
    @Override
    public void pay() {
        System.out.println("Paying invoice");
    }
}
class EmployeePayment implements Payable {
    @Override
    public void pay() {
        System.out.println("Paying employee payment");
    }
}
