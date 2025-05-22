package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

abstract class Animal {
    abstract void makeSound();
    abstract String getType();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    String getType() {
        return "Dog";
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    String getType() {
        return "Cat";
    }
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Moo!");
    }

    @Override
    String getType() {
        return "Cow";
    }
}

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}

class Printer {
    void print(String s) {
        System.out.println("Printing string: " + s);
    }

    void print(int i) {
        System.out.println("Printing int: " + i);
    }

    void print(double d) {
        System.out.println("Printing double: " + d);
    }
}

class Greeter {
    void greet() {
        System.out.println("Hello");
    }

    void greet(String name) {
        System.out.println("Hello, " + name);
    }
}

abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}

class Truck extends Vehicle {
    @Override
    void start() {
        System.out.println("Truck is starting");
    }
}

abstract class Notification {
    abstract void send();
}

class EmailNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending Email Notification");
    }
}

class SMSNotification extends Notification {
    @Override
    void send() {
        System.out.println("Sending SMS Notification");
    }
}

class Converter {
    String convert(int i) {
        return "Converted int: " + i;
    }

    String convert(double d) {
        return "Converted double: " + d;
    }

    String convert(String s) {
        return "Converted string: " + s.toUpperCase();
    }
}

abstract class Product {
    abstract double getPrice();
}

class Book extends Product {
    @Override
    double getPrice() {
        return 20 * 0.9; // 10% discount
    }
}

class Electronic extends Product {
    @Override
    double getPrice() {
        return 100 * 0.85; // 15% discount
    }
}

abstract class Character {
    abstract void attack();
}

class Warrior extends Character {
    @Override
    void attack() {
        System.out.println("Warrior attacks with sword!");
    }
}

class Archer extends Character {
    @Override
    void attack() {
        System.out.println("Archer attacks with bow!");
    }
}

class Mage extends Character {
    @Override
    void attack() {
        System.out.println("Mage attacks with magic!");
    }
}

public class PolymorphismExercises {
    static void showAnimalType(Animal animal) {
        System.out.println("Animal type: " + animal.getType());
    }


    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        Animal[] animals = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : animals) {
            animal.makeSound();
            System.out.println("Type: " + animal.getType());
        }

        // 2. Crea una clase Shape con el método calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        Shape[] shapes = {new Circle(5), new Rectangle(4, 6)};
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }

        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        Printer printer = new Printer();
        printer.print("Hello");
        printer.print(42);
        printer.print(3.14);

        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("John");


        // 5. Crea una clase Vehicle con un método start(). Luego crea Car, Bike y Truck que sobrescriban ese método. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        Vehicle[] vehicles = {new Car(), new Bike(), new Truck()};
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }



        // 6. Crea una clase Notification con método send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.
        Notification[] notifications = {new EmailNotification(), new SMSNotification()};
        for (Notification notification : notifications) {
            notification.send();
        }

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.
        for (Animal animal : animals) {
            showAnimalType(animal);
        }


        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.
        Converter converter = new Converter();
        System.out.println(converter.convert(42));
        System.out.println(converter.convert(3.14));
        System.out.println(converter.convert("Hello"));

        // 9. Crea una clase Product con el método getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.
        Product[] products = {new Book(), new Electronic()};
        for (Product product : products) {
            System.out.println("Price: " + product.getPrice());
        }

        // 10. Crea una clase Character con método attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
        Character[] characters = {new Warrior(), new Archer(), new Mage()};
        for (Character character : characters) {
            character.attack();
        }
        
    }
}
