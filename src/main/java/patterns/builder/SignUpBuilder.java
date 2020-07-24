package patterns.builder;

import patterns.pageObject.pages.ShippingAddressPage;

public class SignUpBuilder {

    private String fullName;
    private String firstAddress;
    private String secondAddress;
    private String city;
    private String region;
    private String zipCode;
    private String country;
    private String phoneNumber;

    private SignUpBuilder(SignUp signUp, boolean generatedPersonalFields) {
        fullName = signUp.fullName;
        firstAddress = signUp.firstAddress;
        secondAddress = signUp.secondAddress;
        city = signUp.city;
        region = signUp.region;
        zipCode = signUp.zipCode;
        country = signUp.country;
        phoneNumber = signUp.phoneNumber;
    }

    public static SignUp newSignUp() {
        return new SignUp();
    }

    public String getFullName() {
        return fullName;
    }

    public String getFirstAddress() {
        return firstAddress;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public String getCity() {
        return city;
    }

    public String getRegion() {
        return region;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static final class SignUp {
        private String fullName;
        private String firstAddress;
        private String secondAddress;
        private String city;
        private String region;
        private String zipCode;
        private String country;
        private String phoneNumber;

        public SignUp() {

        }

        public SignUp setFullName(String value) {
            fullName = value;
            return this;
        }

        public SignUp setFirstAddress(String value) {
            firstAddress = value;
            return this;
        }

        public SignUp setSecondAddress(String value) {
            secondAddress = value;
            return this;
        }

        public SignUp setCity(String value) {
            city = value;
            return this;
        }

        public SignUp setRegion(String value) {
            region = value;
            return this;
        }

        public SignUp setZipCode(String value) {
            zipCode = value;
            return this;
        }

        public SignUp setCountry(String value) {
            country = value;
            return this;
        }

        public SignUp setPhoneNumber(String value) {
            phoneNumber = value;
            return this;
        }

        public SignUpBuilder build() {
            return new SignUpBuilder(this, true);
        }
    }

    public void createAccount(ShippingAddressPage shippingAddressPage) {
        shippingAddressPage.createNewUserPage(this);
    }
}
