package PersonalizedMealPlanGenerator;

class Meal<T extends MealPlan> {
    private T plan;

    public Meal(T plan) {
        this.plan = plan;
    }
    public T getPlan() { return plan; }
}
