package basic.c08_oop;

/*
Clase 7 - Polimorfismo, abstracción y composición (21/05/2025)
Vídeo: https://www.twitch.tv/videos/2464789369
*/

public class AccessModifiersExercises {

    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        Person person = new Person();
        person.setName("Juan");
        person.setAge(30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());  

        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        Product product = new Product();
        product.setPrice(100);
        System.out.println("Price: " + product.getPrice());
        product.setPrice(-50); // Intento de establecer un precio inválido  
        System.out.println("Price: " + product.getPrice()); // Verifica que el precio no cambió


        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Balance: " + account.getBalance());
        account.withdraw(800); // Intento de retirar demasiado dinero
        System.out.println("Balance: " + account.getBalance()); // Verifica que el saldo no cambió

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        Book book = new Book("El Principito");
        System.out.println("Title: " + book.getTitle());    
        // book.setTitle("1984"); // Intento de modificar el título (no permitido)
        // System.out.println("Title: " + book.getTitle()); // Verifica que el título no cambió

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        Temperature temperature = new Temperature();
        temperature.setCelsius(25);
        System.out.println("Temperature: " + temperature.getCelsius());
        temperature.setCelsius(150); // Intento de establecer una temperatura fuera de rango
        System.out.println("Temperature: " + temperature.getCelsius());
        // Verifica que la temperatura no cambió
        // temperature.setTemperature(150); // Intento de establecer una temperatura fuera de rango

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        User user = new User();
        user.setUsername("johndoe");
        user.setPassword("password123");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Password: " + user.getPassword());
        System.out.println("Password check: " + user.checkPassword("password123"));
        System.out.println("Password check: " + user.checkPassword("wrongpassword"));

        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        Employee employee = new Employee(3000);
        employee.raiseSalary(10);
        System.out.println("Salary: " + employee.getSalary());
        employee.raiseSalary(-5); // Intento de aumento negativo
        System.out.println("Salary: " + employee.getSalary()); // Verifica que el salario no cambió
        // employee.setSalary(-500); // Intento de establecer un salario negativo

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());

        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        Student student = new Student();
        student.setGrade(75);
        System.out.println("Grade: " + student.getGrade());
        System.out.println("Passed: " + student.isPassed());

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        Car car = new Car();
        car.setSpeed(50);
        System.out.println("Initial speed: " + car.getSpeed());
        car.accelerate(30);
        System.out.println("Speed after acceleration: " + car.getSpeed());
        car.brake(20);
        System.out.println("Speed after braking: " + car.getSpeed());
        car.accelerate(100); // Intento de acelerar más allá del límite
        System.out.println("Speed after attempting to accelerate beyond the limit: " + car.getSpeed());
        car.brake(100); // Intento de frenar más allá del límite
        System.out.println("Speed after attempting to brake beyond the limit: " + car.getSpeed());
        // Verifica que la velocidad no cambió
        // car.setSpeed(-50); // Intento de establecer una velocidad negativa
        // System.out.println("Speed: " + car.getSpeed()); // Verifica que la velocidad no cambió
    }
}

// 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
// 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
class Product {
    private double price;

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("El precio debe ser mayor a 0.");
        }
    }

    public double getPrice() {
        return price;
    }
}
// 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("El monto a depositar debe ser mayor a 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("El monto a retirar debe ser mayor a 0 y menor o igual al saldo.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


}
// 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void showTitle() {
        System.out.println("Título: " + title);
    }
}

// 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
class Temperature {
    private double celsius;

    public void setCelsius(double celsius) {
        if (celsius >= -100 && celsius <= 100) {
            this.celsius = celsius;
        } else {
            System.out.println("La temperatura debe estar entre -100 y 100 grados Celsius.");
        }
    }
    public double getCelsius() {
        return celsius;
    }   
    public void showTemperature() {
        System.out.println("Temperatura: " + celsius + "°C");
    }
    public void setTemperature(double celsius) {
        this.celsius = celsius;
    }
}

// 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
class User {
    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }
    
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void showUser() {
        System.out.println("Usuario: " + username);
    }
    public void showPassword() {
        System.out.println("Contraseña: " + password);
    }


}
// 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * percent / 100;
        } else {
            System.out.println("El aumento debe ser positivo.");
        }
    }

    public double getSalary() {
        return salary;
    }
    public void showSalary() {
        System.out.println("Salario: " + salary);
    }   

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }   

    public void setSalary(long salary) {
        this.salary = salary;
    }   
    public void setSalary(double salary, double bonus) {
        this.salary = salary + bonus;
    }   
    public void setSalary(double salary, double bonus, double tax) {
        this.salary = salary + bonus - tax;
    }

    public void setSalary(double salary, double bonus, double tax, double discount) {
        this.salary = salary + bonus - tax - discount;
    }
    public void setSalary(double salary, double bonus, double tax, double discount, double insurance) {
        this.salary = salary + bonus - tax - discount - insurance;
    }
    public void setSalary(double salary, double bonus, double tax, double discount, double insurance, double retirement) {
        this.salary = salary + bonus - tax - discount - insurance - retirement;
    }
    public void setSalary(double salary, double bonus, double tax, double discount, double insurance, double retirement, double other) {
        this.salary = salary + bonus - tax - discount - insurance - retirement - other;
    }
}

// 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
class Rectangle {
    private double width;
    private double height;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public void showWidth() {
        System.out.println("Ancho: " + width);
    }
    public void showHeight() {
        System.out.println("Alto: " + height);
    }   
    public void showArea() {
        System.out.println("Área: " + calculateArea());
    }       
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}   

// 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
class Student {
    private int grade;

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed() {
        return grade >= 60;
    }
    public int getGrade() {
        return grade;
    }
    public void showGrade() {
        System.out.println("Nota: " + grade);
    }   
}       
// 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).   
class Car {
    private int speed;   

    public void accelerate(int amount) {

        if (speed + amount <= 120) {
            speed += amount;
        } else {
            speed = 120;
        }
    }
    public void brake(int amount) {
        if (speed - amount >= 0) {
            speed -= amount;
        } else {
            speed = 0;
        }
    }
    public int getSpeed() {
        return speed;
    }

    public void showSpeed() {
        System.out.println("Velocidad: " + speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setSpeed(double speed) {
        this.speed = (int) speed;
    }
    public void setSpeed(float speed) {
        this.speed = (int) speed;
    }   
    public void setSpeed(long speed) {
        this.speed = (int) speed;
    }   
}