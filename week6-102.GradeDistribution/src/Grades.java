import java.util.ArrayList;

public class Grades {

    private int points;
    private String grades;

    public Grades(int points) {
        this.points = points;
    }

    public boolean checkPoints() {
        if (this.points > 60 || this.points < 0) {
            return false;
        } else {
            return true;
        }
    }

    public String correspondingGrades() {
        if (this.checkPoints()) {
            if (this.points > 49) {
                this.grades = "5";
                return this.grades;
            } else if (this.points > 44) {
                this.grades = "4";
                return this.grades;
            } else if (this.points > 39) {
                this.grades = "3";
                return this.grades;
            } else if (this.points > 34) {
                this.grades = "2";
                return this.grades;
            } else if (this.points > 29) {
                this.grades = "1";
                return this.grades;
            } else {
                this.grades = "0";
                return this.grades;
            }
        } else {
            return "";
        }
    }
}
