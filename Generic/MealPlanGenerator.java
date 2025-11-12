interface MealPlan { String getPlan(); }
class VegetarianMeal implements MealPlan { public String getPlan(){return "Vegetarian Plan";} }
class VeganMeal implements MealPlan { public String getPlan(){return "Vegan Plan";} }
class Meal<T extends MealPlan> {
    T plan;
    Meal(T plan){ this.plan=plan; }
    static <T extends MealPlan> void generatePlan(T plan){ System.out.println("Generated: "+plan.getPlan()); }
    public static void main(String[] args){
        generatePlan(new VegetarianMeal());
        generatePlan(new VeganMeal());
    }
}