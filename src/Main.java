//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee max = new Employee("max","10/10/2010","10/10/2010");
        System.out.println(max);
        System.out.println("Age =>" + max.getAge());
        System.out.println("Paay =>" + max.collectPay());

        }
    }
