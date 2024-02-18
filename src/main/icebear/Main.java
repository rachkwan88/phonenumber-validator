public class Main {
    public static void main(String[] args) {
        PhoneNumberValidator validator = new PhoneNumberValidator();
        System.out.println("Hello, World!");

        String phoneNumbers[] = {"123-456-7890", "12sss34567890"};
        for (String phoneNumber : phoneNumbers) {
            System.out.println("Phone number " + phoneNumber + " is " + (validator.isValidPhoneNumber(phoneNumber) ? "valid" : "invalid"));
        }
    }
}