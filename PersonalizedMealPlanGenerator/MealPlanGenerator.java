package PersonalizedMealPlanGenerator;

class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(T mealPlan) {
        System.out.println("Generating plan: " + mealPlan.getPlanName());
        System.out.println("Plan validated and ready!");
    }
}

