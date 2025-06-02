package creational.builder;

/**
 *  Builder Pattern :-
 *
 *  a. It is a creational pattern that lets you construct complex object step by step,
 *     and same steps can be used to make different versions of the objects
 *
 *  When to use :
 *
 *  a. When an object requires many constructor parameters (especially optional ones).
 *  b. When you need to create an object with different representations.
 *  c. When you want immutability after construction.
 *  d. When dealing with complex object creation logic.
 */

public class BuilderTest {
    public static void main(String[] args) {
        // Build a user with mandatory fields only
        User user1 = new User.Builder("Sanjay", "Sahu").build();
        System.out.println(user1);

        // Build a user with some optional fields
        User user2 = new User.Builder("Siddhartha", "Roy")
                .email("siddu007@gmail.com")
                .phone("1234567")
                .build();
        System.out.println(user2);

        // Build a user with all fields
        User user3 = new User.Builder("Ojhas", "Gambhira")
                .email("og01@gmail.com")
                .phone("234567")
                .address("Japan")
                .build();
        System.out.println(user3);

        // Example of validation

        try {
            User invalidUser = new User.Builder(null, "Kalyan").build();
            System.out.println(invalidUser); // line will not print
        } catch (IllegalStateException ex) {
            System.out.println("Error : " + ex.getMessage());
        }
    }
}
