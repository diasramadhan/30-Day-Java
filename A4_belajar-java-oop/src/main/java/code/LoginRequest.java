package code;

public record LoginRequest(String username,String password) {
    @Override
    public String toString() {
        return "Username = " + username +
                "\nPassword = " + password;
    }
}
