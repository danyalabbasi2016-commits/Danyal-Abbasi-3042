import java.util.Scanner;

/**
 * Main class
 * Driver program to test all lab and home tasks
 */
public class Main {

    /**
     * Main method
     * Executes and tests all classes
     */
    public static void main(String[] args) {

        /* =========================================================
         * Lab Task No 1
         * Address and Person testing
         * ========================================================= */
        System.out.println("=== Testing Address and Person Class ===\n");

        Address address = new Address("River Road", "22A", "Chicago", "60616");
        Person person = new Person("Emily Carter", address);
        System.out.println(person);


        /* =========================================================
         * Lab Task No 2
         * Employee Management System
         * ========================================================= */
        System.out.println("\n=== Employee Management System ===\n");
        System.out.println("Current Year: 2012\n");

        Date dob1 = new Date(20, 8, 1978);     // Date of birth
        Date doj1 = new Date(12, 6, 2009);     // Date of joining
        Employee emp1 = new Employee("Michael Brown", "EMP101", doj1, dob1);

        System.out.println("=== Employee 1 ===");
        System.out.println(emp1);
        System.out.println("Joined within last 5 years? " + emp1.joinedWithinLastFiveYears());
        System.out.println("Age less than 40 years? " + emp1.isAgeLessThanForty());


        /* =========================================================
         * Lab Task No 3
         * Book and Tape details
         * ========================================================= */
        System.out.println("\nEnter book details:");
        Book book = new Book();
        book.getdata();        // Input book details

        System.out.println("\nEnter audio cassette details:");
        Tape tape = new Tape();
        tape.getdata();        // Input tape details

        System.out.println("\n=== Results ===");
        book.putdata();        // Display book details
        tape.putdata();        // Display tape details


        /* =========================================================
         * Lab Task No 4
         * Person1 and Student testing
         * ========================================================= */
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Testing Person1 Class ===");
        Person1 person1 = new Person1();
        person1.input();       // Input personal data
        person1.display();     // Display personal data

        System.out.println("\n=== Testing Student Class ===");
        Student student = new Student();
        student.input();       // Input student data
        student.display();     // Display student data

        System.out.println("\n=== Testing with Parameterized Constructor ===");
        Student student2 = new Student(
                "P009", "Daniel Moore", "789 Pine St", "S2024055", 91.2
        );
        student2.display();    // Display student data


        /* =========================================================
         * Lab Task No 5
         * Computer and Laptop classes
         * ========================================================= */
        System.out.println("\n=== Testing Computer Class ===");

        Computer computer1 = new Computer();
        computer1.display();   // Default computer info

        Computer computer2 = new Computer(64, 8192, 512000, 3200.0);
        computer2.display();   // Custom computer info

        System.out.println("\n=== Testing Laptop Class ===");

        Laptop laptop1 = new Laptop();
        laptop1.display();     // Default laptop info

        Laptop laptop2 = new Laptop(
                64, 16384, 1000000, 2400.0,
                14.0, 9.5, 0.7, 3.0
        );
        laptop2.display();     // Custom laptop info

        // Updating laptop1 using setter methods
        laptop1.setWordSize(32);
        laptop1.setMemorySize(4096);
        laptop1.setStorageSize(256000);
        laptop1.setSpeed(2100.0);
        laptop1.setLength(15.0);
        laptop1.setWidth(10.0);
        laptop1.setHeight(0.9);
        laptop1.setWeight(4.2);
        laptop1.display();


        /* =========================================================
         * Home Task No 1
         * Test and result calculation
         * ========================================================= */
        System.out.println("\n=== TESTING ===");

        Test student1 = new Test();
        student1.getdata();        // Input student data
        student1.getmarks();      // Input marks
        student1.Finalresult();   // Calculate result
        student1.displayAll();    // Display full result


        /* =========================================================
         * Home Task No 2
         * Simple and Complex operations
         * ========================================================= */
        System.out.println("\n=== TESTING SIMPLE AND COMPLEX CLASSES ===");

        Simple simple1 = new Simple(15, 3);
        simple1.displayNumbers();
        simple1.add();
        simple1.sub();
        simple1.mul();
        simple1.div();

        Complex complex1 = new Complex(10, 4);
        complex1.showAllOperations();

        Complex complex2 = new Complex(-6, 3);
        complex2.showAllOperations();

        Complex complex3 = new Complex(5, 0);
        complex3.showAllOperations();


        /* =========================================================
         * Home Task No 3
         * Electricity Bill System
         * ========================================================= */
        System.out.println("\n=== ELECTRICITY BILL CALCULATION SYSTEM ===");

        Electricity consumer1 = new Electricity("Oliver King", 75);
        consumer1.displayBill();

        More_Electricity consumer2 = new More_Electricity("Sophia Adams", 120);
        consumer2.displayBill();

        More_Electricity consumer3 = new More_Electricity("Ethan Miller", 250);
        consumer3.displayBill();

        More_Electricity consumer4 = new More_Electricity("Isabella Clark", 420);
        consumer4.displayBill();


        /* =========================================================
         * Home Task No 4
         * Package Delivery Service
         * ========================================================= */
        System.out.println("\n=== PACKAGE DELIVERY SERVICE ===");

        Package regularPackage = new Package(
                "Liam Turner", "12 North St", "Dallas", "TX", "75201",
                "Ava Scott", "98 West Ave", "Denver", "CO", "80202",
                30.0, 0.26
        );
        regularPackage.displayInfo();

        TwoDayPackage twoDayPackage = new TwoDayPackage(
                "Noah Green", "55 Elm Rd", "Phoenix", "AZ", "85001",
                "Mia Hall", "77 Lake Dr", "Portland", "OR", "97201",
                45.0, 0.32, 6.25
        );
        twoDayPackage.displayInfo();

        OvernightPackage overnightPackage = new OvernightPackage(
                "Lucas White", "400 Hill St", "San Diego", "CA", "92101",
                "Grace Lewis", "900 Ocean Blvd", "Tampa", "FL", "33601",
                18.0, 0.38, 0.45
        );
        overnightPackage.displayInfo();


        /* =========================================================
         * Package comparison
         * ========================================================= */
        System.out.println("\n=== PACKAGE COMPARISON ===");

        double weight = 24.0;
        double costPerOunce = 0.28;

        Package p1 = new Package(
                "Sender One", "11 A St", "CityA", "AA", "11111",
                "Receiver One", "22 B St", "CityB", "BB", "22222",
                weight, costPerOunce
        );
        p1.displayInfo();

        TwoDayPackage p2 = new TwoDayPackage(
                "Sender One", "11 A St", "CityA", "AA", "11111",
                "Receiver One", "22 B St", "CityB", "BB", "22222",
                weight, costPerOunce, 5.75
        );
        p2.displayInfo();

        OvernightPackage p3 = new OvernightPackage(
                "Sender One", "11 A St", "CityA", "AA", "11111",
                "Receiver One", "22 B St", "CityB", "BB", "22222",
                weight, costPerOunce, 0.55
        );
        p3.displayInfo();

        // Close scanner
        scanner.close();
    }
}
