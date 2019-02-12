package lesson12.HW;

public class Report {

    public static void generateReport(Employee[] employees){

        for (Employee empl:employees) {
            System.out.printf("%10s зарплата %.2f%n",empl.fullName,empl.salaryDate);

        }

    }
}
