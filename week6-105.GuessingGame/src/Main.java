public class Main {

    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();
        // we play two rounds
        game.play(1,4);
        game.play(10,99);
    }
}
