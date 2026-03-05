public class SalariedEmployee extends Employee{

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(){
        super("Bill","01/06/1995","01/06/2010","01/01/2011");

    }

    public boolean retire(){
        this.isRetired = true;
        return this.isRetired;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
