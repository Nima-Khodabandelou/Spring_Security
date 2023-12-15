package io.nkh1987.spring_security.auth;

import java.util.Objects;

public class RegisterRequest {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public RegisterRequest(String firstname, String lastname, String email, String password) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
    }

    public RegisterRequest() {
    }

    public static RegisterRequestBuilder builder() {
        return new RegisterRequestBuilder();
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RegisterRequest)) return false;
        RegisterRequest that = (RegisterRequest) o;
        return Objects.equals(getFirstname(), that.getFirstname()) && Objects.equals(getLastname(), that.getLastname()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstname(), getLastname(), getEmail(), getPassword());
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RegisterRequest;
    }

    public String toString() {
        return "RegisterRequest(firstname=" + this.getFirstname() + ", lastname=" + this.getLastname() + ", email=" + this.getEmail() + ", password=" + this.getPassword() + ")";
    }

    public static class RegisterRequestBuilder {
        private String firstname;
        private String lastname;
        private String email;
        private String password;

        RegisterRequestBuilder() {
        }

        public RegisterRequestBuilder firstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public RegisterRequestBuilder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public RegisterRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public RegisterRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public RegisterRequest build() {
            return new RegisterRequest(firstname, lastname, email, password);
        }

        public String toString() {
            return "RegisterRequest.RegisterRequestBuilder(firstname=" + this.firstname + ", lastname=" + this.lastname + ", email=" + this.email + ", password=" + this.password + ")";
        }
    }
}
