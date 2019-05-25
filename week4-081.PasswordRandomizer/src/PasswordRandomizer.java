import java.util.Random;

public class PasswordRandomizer {

    private int length;
    private String allChar;
    private Random random;

    public PasswordRandomizer(int length) {
        this.length = length;
        allChar = "abcdefghijklmnopqrstuvwxyz";
        random = new Random();
    }

    public String createPassword() {
        String password = "";
        int i = 0;
        while (i < this.length) {
            password += allChar.charAt(random.nextInt(25));
            i++;
        }
        return password;
    }
}
