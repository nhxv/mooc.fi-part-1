import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    //constructor
    public Menu() {
        this.meals = new ArrayList<String>();
    }

    //add meal
    public void addMeal(String meal) {
        if(!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    //print meal to menu
    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    //clear meal in menu
    public void clearMenu() {
        this.meals.clear();
    }
}
