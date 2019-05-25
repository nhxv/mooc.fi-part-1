import java.util.ArrayList;

public class Distribution {

    private ArrayList<Integer> pointsList;
    private String gradeFive = "5: ";
    private String gradeFour = "4: ";
    private String gradeThree = "3: ";
    private String gradeTwo = "2: ";
    private String gradeOne = "1: ";
    private String gradeZero = "0: ";
    private int gradeFiveCount;
    private int gradeFourCount;
    private int gradeThreeCount;
    private int gradeTwoCount;
    private int gradeOneCount;
    private int gradeZeroCount;

    public Distribution(ArrayList<Integer> pointsList) {
        this.pointsList = pointsList;
    }

    public void printGrade() {
        for (int points : pointsList) {
            Grades grades = new Grades(points);
            if (grades.correspondingGrades().equals("5")) {
                gradeFive += "*";
            } else if (grades.correspondingGrades().equals("4")) {
                gradeFour += "*";
            } else if (grades.correspondingGrades().equals("3")) {
                gradeThree += "*";
            } else if (grades.correspondingGrades().equals("2")) {
                gradeTwo += "*";
            } else if (grades.correspondingGrades().equals("1")) {
                gradeOne += "*";
            } else if (grades.correspondingGrades().equals("0")) {
                gradeZero += "*";
            }
        }
        System.out.println(gradeFive);
        System.out.println(gradeFour);
        System.out.println(gradeThree);
        System.out.println(gradeTwo);
        System.out.println(gradeOne);
        System.out.println(gradeZero);
    }

    public int countStar(String grade) {
        int count = grade.length() - grade.replace("*", "").length();
        return count;
    }

    public void setDistribute() {
        gradeFiveCount = this.countStar(gradeFive);
        gradeFourCount = this.countStar(gradeFour);
        gradeThreeCount = this.countStar(gradeThree);
        gradeTwoCount = this.countStar(gradeTwo);
        gradeOneCount = this.countStar(gradeOne);
        gradeZeroCount = this.countStar(gradeZero);
    }

    public double acceptancePercentage() {
        setDistribute();
        double accepted = gradeFiveCount + gradeFourCount + gradeThreeCount + gradeTwoCount + gradeOneCount;
        double allScores = gradeFiveCount + gradeFourCount + gradeThreeCount + gradeTwoCount + gradeOneCount + gradeZeroCount;
        double percentage = 100*accepted/allScores;
        return percentage;
    }

    public void printResult() {
        System.out.println("Grade distribution: ");
        this.printGrade();
        System.out.println("Acceptance percentage: " + acceptancePercentage());
    }
}
