public class PhoneNumberValidator {
    // return true for the following
    // * 123-456-7890
    // * 1234567890
    // * 123 456 7890
    // * 123.456.7890
    // * (123) 456-7890
    // return false for following
    // * a123423434
    public boolean isValidPhoneNumber(String phoneNumber) {
        String new_phoneNumber="";
        for (int i=0 ;i<phoneNumber.length(); i++)
        {
            if (phoneNumber.charAt(i)=='-' || phoneNumber.charAt(i)=='.'|| phoneNumber.charAt(i)=='(' || phoneNumber.charAt(i)==')')
            {
                // skip

            }
            else if(phoneNumber.charAt(i) >= '0' && phoneNumber.charAt(i)<='9'){
                //gives the digit
                new_phoneNumber += phoneNumber.charAt(i);
            }
            else {
                return false;
            }

        }
        if (new_phoneNumber.length() != 10){
            return false;
        }

        return true;
    }
}
