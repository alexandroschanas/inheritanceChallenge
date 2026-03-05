public class HourlyEmployee extends Employee{

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, String endDate, double hourlyPayRate) {
        super(name, birthDate, hireDate, endDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getDoublePay(){

        return hourlyPayRate > 100.00 ? ((hourlyPayRate/250)/8) : hourlyPayRate;

    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPayRate=" + getDoublePay() +
                "} " + super.toString();
    }
}
