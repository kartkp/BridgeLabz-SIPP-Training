package PersonalizedMealPlanGenerator;

public class mainMealPlanGenerator {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());

        System.out.println("Meal Plan Generator:\n");
        MealPlanGenerator.generatePlan(vegMeal.getPlan());
        MealPlanGenerator.generatePlan(veganMeal.getPlan());
        MealPlanGenerator.generatePlan(ketoMeal.getPlan());
    }
}

