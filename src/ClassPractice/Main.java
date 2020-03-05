package ClassPractice;

public class Main {

    public static void main(String[] args) {

        // initializes the object based on the template, car.
//        Car porsche = new Car();
//        Car holden = new Car();
//
//        porsche.setModel("Carrera");
//        System.out.println("Model is " + porsche.getModel());
//
//        BankAccount bobsAccount = new BankAccount(12345, 0.00, "Bob Brown", "bob@gmail.com", "320-123-4567");
//        System.out.println(bobsAccount.getPhoneNumber());
//        System.out.println(bobsAccount.getEmail());
//
//        bobsAccount.withdrawal(100);
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdrawal(25.0);

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "Tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());


    }
}
