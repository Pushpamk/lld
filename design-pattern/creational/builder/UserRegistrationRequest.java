public class UserRegistrationRequest {
    private final String address;
    private final String name;
    private final String email;
    private final String username;
    private final String phoneNumber;
    private final int age;
    private final boolean newsletterSubscribed;

    private UserRegistrationRequest(Builder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.username = builder.username;
        this.phoneNumber = builder.phoneNumber;
        this.age = builder.age;
        this.newsletterSubscribed = builder.newsletterSubscribed;
        this.address = builder.address;
    }

    public static class Builder {
        // required fields
        private final String name;
        private final String email;
        private final String username;

        // non-required fields;
        private String phoneNumber;
        private boolean newsletterSubscribed;
        private int age;
        private String address;

        public Builder(String name, String email, String username) {
            this.name = name;
            this.email = email;
            this.username = username;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder subscribeNewsletter(boolean newsletterSubscribed) {
            this.newsletterSubscribed = newsletterSubscribed;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserRegistrationRequest build() {
            return new UserRegistrationRequest(this);
        }
    }
}