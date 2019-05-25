public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter(900, false);
        counter.decrease();
        System.out.println(counter.value());
        System.out.println(counter.check());
    }
}
