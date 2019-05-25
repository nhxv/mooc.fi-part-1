public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {
        //if same date, then dayDifference is 0
            int dayDifference = 0;

            //clone object so the change wouldn't affect this.day/month/year
            MyDate cloneThis = this.clone();
            MyDate cloneComparedDate = comparedDate.clone();

            //while the two dates are different, change one to match another
            while (!cloneThis.isEqual(cloneComparedDate)) {
                dayDifference++;

                //if this date is earlier, increase this date, otherwise increase compared date
                if (cloneThis.earlier(cloneComparedDate)) {
                    cloneThis.advance();
                } else {
                    cloneComparedDate.advance();
                }
            }

            //year difference, assuming each month has 30 days and no leap year
            int yearDifference = dayDifference/360;
            return yearDifference;
    }

    public boolean isEqual(MyDate date) {
        if (this.day == date.day && this.month == date.month && this.year == date.year) {
            return true;
        } else {
            return false;
        }
    }

    public MyDate clone() {
        MyDate clone = new MyDate(this.day, this.month, this.year);
        return clone;
    }

    public void advance() {
        //assuming every months has 30 days
        if (this.day == 30) {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        } else {
            this.day++;
        }
    }

}
