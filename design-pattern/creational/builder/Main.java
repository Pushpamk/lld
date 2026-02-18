class Main {
    public static void main(String[] args) {
        UserRegistrationRequest regReq = new UserRegistrationRequest.Builder(
            "Pushpam",
            "pushpam@gmail.com",
            "pushpamkumar"
        )
        .setAddress("#123, NewYork")
        .build();
    }
}