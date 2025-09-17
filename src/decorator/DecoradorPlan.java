package decorator;

abstract class DecoradorPlan implements Plan {
    protected Plan plan;

    public DecoradorPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public double getCosto() {
        return plan.getCosto();
    }
}
