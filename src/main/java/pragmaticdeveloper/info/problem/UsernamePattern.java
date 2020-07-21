package pragmaticdeveloper.info.problem;

public class UsernamePattern {
    public static boolean validate(String username) {
        return username.matches("^[a-zA-Z]+[a-zA-Z0-9.]\\w{1,10}+\\b(?!\\.)+$");
    }

    public static void main(String[] args) {
        System.out.println(validate("Ro"));
    }
}
