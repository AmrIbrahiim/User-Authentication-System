public class User {
    private final String username;
    private final String hashedPassword;
    public User(String username, String password) {
        this.username = username;
        this.hashedPassword =HashUtil.hashPassword(password);
    }
    public boolean authenticate(String inputUsername, String inputPassword) {
        String inputHash = HashUtil.hashPassword(inputPassword);
        return username.equals(inputUsername) && hashedPassword.equals(inputHash);
    }
}
