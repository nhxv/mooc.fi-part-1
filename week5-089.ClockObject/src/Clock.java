public class Clock {

    private BoundedCounter hours = new BoundedCounter(23);;
    private BoundedCounter minutes = new BoundedCounter(59);
    private BoundedCounter seconds = new BoundedCounter(59);

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        this.seconds.next();
        if (Integer.parseInt(seconds.toString()) == 0) {
            this.minutes.next();
            if (Integer.parseInt(minutes.toString()) == 0) {
                this.hours.next();
            }
        }
    }

    public String toString() {
       return hours.toString()  + ":" + minutes.toString() + ":" + seconds.toString();
    }
}
