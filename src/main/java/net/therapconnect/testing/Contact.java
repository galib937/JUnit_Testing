package net.therapconnect.testing;

public class Contact {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(String firstName, String lastName, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void validateFirstName(String firstName) {
//        if(firstName == null || !firstName.matches("^[a-zA-Z].*$")) {
//            throw new IllegalArgumentException("First name must contain at least one letter");
//        }
        if(this.firstName.isBlank()){
//            throw new RuntimeException("First name cannot be blank.");
            throw new IllegalArgumentException("First name cannot be blank.");
        }
    }

    public void validateLastName(String lastName) {
        if(this.lastName.isBlank()){
           //throw new RuntimeException("Last name cannot be blank.");
            throw new RuntimeException("Last name cannot be blank.");
        }

    }

    public void validatePhoneNumber(String phoneNumber) {
        if(this.phoneNumber.isBlank()){
            //throw new RuntimeException("Phone number cannot be blank");
            throw new IllegalArgumentException("Phone number cannot be blank.");
        }

        if(phoneNumber.length() != 11){
            throw new IllegalArgumentException("Phone number must be 11 digits.");
        }

        if(!this.phoneNumber.matches("\\d+")){
            throw new IllegalArgumentException("Phone number must contain digits only");
        }

        if(this.phoneNumber.startsWith("0")){
            throw new IllegalArgumentException("Phone number must start with 0");
        }
    }

}
