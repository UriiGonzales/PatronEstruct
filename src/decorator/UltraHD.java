package decorator;

class UltraHD extends DecoradorPlan {
    public UltraHD(Plan plan) {
        super(plan);
    }

    @Override
    public double getCosto() {
        return plan.getCosto() + 1000;
    }
}