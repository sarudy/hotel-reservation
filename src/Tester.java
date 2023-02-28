import static service.CustomerService.addCustomer;

public class Tester {
    public static void main(String[] args) {
// begin email format test
        // inline value test
        /*
        Customer goodCustomer = new Customer("Henry", "Jekyll", "drjekyll@valid.com");
        System.out.println(goodCustomer);

        Customer badCustomer = new Customer("Edward", "Hyde", "misterhydenowhere.com");
        System.out.println(badCustomer);
        */
        // user entered value test
        /*
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n Enter your first name:");
            String userFirst = scanner.nextLine();
            System.out.println("\n Enter your last name:");
            String userLast = scanner.nextLine();
            System.out.println("\n Enter your email. This will also be your customer id:");
            String userEmail = scanner.nextLine();
            Customer enteredCustomer = new Customer(userFirst, userLast, userEmail);
            System.out.println(enteredCustomer);
        } catch (IllegalArgumentException e) {
            System.out.println("Please enter a valid email address.");
        } */
// end email format test
// begin customer service test
        addCustomer("John", "Dow", "add@b.com");
        addCustomer("Jane", "Doro", "aasd@b.com");
        addCustomer("Amy", "Niger", "aSDDA@b.com");
        addCustomer("Mary", "Magdalene", "aSDF@b.com");
        addCustomer("Elizabeth", "Dumas", "aASDAS@b.com");
/*        System.out.println(getAllCustomers());
        System.out.println(getCustomer("add@b.com")); */
// end customer service test


    }

}