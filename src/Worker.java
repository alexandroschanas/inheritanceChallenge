public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;



    public double collectPay(){
        return 0.0;
    }

    public void terminate(String endDate){
        this.endDate = endDate;
    }

    public Worker(String name,String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name,String birthDate,String endDate){
        this.name = name;
        this.birthDate = birthDate;
        terminate(endDate);
    }

    public int getAge(){
        int todayYear = 2026;
        int intBirth = Integer.parseInt(birthDate.substring(6));

        return todayYear-intBirth;
    }


    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                "}  hen age are " +  getAge();
    }
}
