public class Reformatory {

    private int counter;

    public int weight(Person person) {
        // return the weight of the person
        counter++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int weight = person.getWeight();
        weight++;
        person.setWeight(weight);
    }

    public int totalWeightsMeasured() {
        return counter;
    }

}
