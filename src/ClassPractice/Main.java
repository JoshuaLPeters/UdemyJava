package ClassPractice;

public class Main {

    public static void main(String[] args) {

        // initializes the object based on the template, car.
        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        BankAccount bobsAccount = new BankAccount(12345, 0.00, "Bob Brown", "bob@gmail.com", "320-123-4567");
        System.out.println(bobsAccount.getPhoneNumber());
        System.out.println(bobsAccount.getEmail());

        bobsAccount.withdrawal(100);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(25.0);
    }
}
