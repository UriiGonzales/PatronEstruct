package decorator;

public class DescargasOffline extends DecoradorPlan {
    public DescargasOffline(Plan plan) {
        super(plan);
    }

    @Override
    public double getCosto() {
        return plan.getCosto() + 700;
    }
}

