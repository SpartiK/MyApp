package lesson12.HW;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    public static void generateReport(Employee[] employees,Locale lk){
NumberFormat nf = NumberFormat.getCurrencyInstance(lk);
        for (Employee empl:employees) {
            System.out.printf("%10s %s %s%n",empl.fullName,nf.format(empl.salary),empl.salaryDate);

        }

    }
}
