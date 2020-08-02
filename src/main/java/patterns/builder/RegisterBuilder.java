package patterns.builder;


import patterns.pageObject.pages.users.AddNewUserPage;

public class RegisterBuilder {

    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String webSite;
    private String role;

    private RegisterBuilder(User user, boolean generatedPersonalFields) {
        userName = user.userName;
        firstName = user.firstName;
        lastName = user.lastName;
        email = user.email;
        webSite = user.webSite;
        role = user.role;
    }

    public static User newUser() {
        return new User();
    }

    public String getUserName() {
        return userName;
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

    public String getWebSite() {
        return webSite;
    }

    public String getRole() {
        return role;
    }

    public static final class User
    {
        private String userName;
        private String firstName;
        private String lastName;
        private String email;
        private String webSite;
        private String role;

        public User() {

        }

        public User setUserName(String value) {
            userName = value;
            return this;
        }

        public User setFirstName(String value) {
            firstName = value;
            return this;
        }

        public User setLastName(String value) {
            lastName = value;
            return this;
        }

        public User setEmail(String value) {
            email = value;
            return this;
        }

        public User setWebSite(String value) {
            webSite = value;
            return this;
        }

        public User setRole(String value) {
            role = value;
            return this;
        }

        public RegisterBuilder build() {
            return new RegisterBuilder(this, true);
        }
    }

    public void createAccount(AddNewUserPage addNewUserPAge) {
        addNewUserPAge.createNewUserPage(this);
    }
}
