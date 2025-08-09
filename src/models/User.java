package models;

public class User {
    private final String username;
    private final String password;
    private final String email;
    private final int point;

    public User(String username, String password, String email, int point) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.point = point;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public String getEmail() { return email; }
    public int getPoint() { return point; }
}
