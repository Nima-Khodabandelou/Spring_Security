package io.nkh1987.spring_security.auth;

import java.util.Objects;

public class AuthenticationRequest {
    private String email;
    private String password;

    public AuthenticationRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public AuthenticationRequest() {
    }

    public static AuthenticationRequestBuilder builder() {
        return new AuthenticationRequestBuilder();
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof AuthenticationRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AuthenticationRequest)) return false;
        AuthenticationRequest that = (AuthenticationRequest) o;
        return Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getPassword(), that.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEmail(), getPassword());
    }

    public String toString() {
        return "AuthenticationRequest(email=" + this.getEmail() + ", password=" + this.getPassword() + ")";
    }

    public static class AuthenticationRequestBuilder {
        private String email;
        private String password;

        AuthenticationRequestBuilder() {
        }

        public AuthenticationRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public AuthenticationRequestBuilder password(String password) {
            this.password = password;
            return this;
        }

        public AuthenticationRequest build() {
            return new AuthenticationRequest(email, password);
        }

        public String toString() {
            return "AuthenticationRequest.AuthenticationRequestBuilder(email=" + this.email + ", password=" + this.password + ")";
        }
    }
}
