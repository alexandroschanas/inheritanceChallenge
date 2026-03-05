public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){
        super("Bill","01/06/1995","01/06/2010","01/01/2011");

    }

    public SalariedEmployee(String name, String birthDate, String hireDate, String endDate, double annualSalary, boolean isRetired) {
        super(name, birthDate, hireDate, endDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }


    public boolean retire(){
        this.isRetired = true;
        return this.isRetired;
    }

    public double collectPay(){
        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return Math.round(adjustedPay * 100.0) / 100.0;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "biweekly salary=" + collectPay() +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
