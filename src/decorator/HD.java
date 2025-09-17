package decorator;

public class HD extends DecoradorPlan {
    public HD(Plan plan) {
        super(plan);
    }

    @Override
    public double getCosto() {
        return plan.getCosto() + 500;
    }
}