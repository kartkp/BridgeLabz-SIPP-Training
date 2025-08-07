package Regex.src.main.java.com.myproject;

public class Login implements IAuthenticatable {

    private String email;
    private String password;

    public Login() {
    }

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    @Override
    public String toString() {
        return "Login{" +
               "email='" + email + '\'' +
               ", password='" + "[HIDDEN]" + '\'' +
               '}';
    }
}
