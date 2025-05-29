package creational.factory;

public class GetPlanFactory {

    public Plan getPlan(String planType) {
        if (planType == null) return null;
        else if (planType == "Domestic") {
            return new DomesticPlan();
        } else if (planType == "Commercial") {
            return new CommercialPlan();
        } else if (planType == "Institutional") {
            return new InstitutionalPlan();
        }
        return null;
    }
}
