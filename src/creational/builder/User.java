package creational.builder;


public class User {
    // Mandatory Fields
    private final String firstName;
    private final String lastName;

    // Optional Fields
    private final String email;
    private final String phone;
    private final String address;

    // Private constructor - only accessible by the builder
    private User(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    // Static nested Builder class
    public static class Builder {
        // Mandatory Fields
        private final String firstName;
        private final String lastName;

        // Optional Fields
        private String email;
        private String phone;
        private String address;

        // Builder constructor for mandatory fields
        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // Setter-like methods for optional fields, returning this for chaining
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            // Optional : Validation before building
            if (firstName == null || lastName == null ||
                    firstName.trim().isEmpty() || lastName.trim().isEmpty()) {
                throw new IllegalStateException("First name and last name should not be null.");
            }
            return new User(this);
        }
    }
}
