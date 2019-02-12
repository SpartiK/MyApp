package lesson12.HW;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.Locale;
import java.util.ResourceBundle;

public class Employee {
    public LocalDate salaryDate;
    public String fullName;
    public double salary;

    public Employee( String fullName, double salary) {
        this.salaryDate = LocalDate.now();
        this.fullName = fullName;
        this.salary = salary;
    }
    private static void printInfo(Locale current,Employee[] employees,Locale lk)
            throws UnsupportedEncodingException {

        ResourceBundle rb = ResourceBundle.getBundle("base", current);
        System.out.println(rb.getString("topic3"));
        FullReport.generateReport(employees,lk);


    }
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee [] employees = new Employee[3];
        employees [0]= new Employee("Nikita",400.221);
        employees [1]= new Employee("Vova",344.999);
        employees [2]= new Employee("Bogdan",510);
        Locale localeUA = new Locale("uk");
        Locale localeRU = new Locale("ru");
        Locale localeEN = new Locale("en");
        Locale localeUS = new Locale("fr");



        printInfo(new Locale("ru", "RU"),employees,localeRU);
        printInfo(new Locale("uk", "UA"),employees,localeUA);
        printInfo(new Locale("en", "US"),employees,localeEN);


        //  Report.generateReport(employees);


    }

}
