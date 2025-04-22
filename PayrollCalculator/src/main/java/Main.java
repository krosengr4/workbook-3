import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        FileReader reader;
        try {
            reader = new FileReader("/Users/rosen/pluralsight/workbook-3/PayrollCalculator/src/main/resources/DataFiles/employees.csv");
            String input;
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((input = bufferedReader.readLine()) != null) {
                String[] lineData = input.split("\\|");

                if(lineData[0].equals("id")) {
                    continue;
                }

                int id = Integer.parseInt(lineData[0]);
                String name = lineData[1];
                double hours = Double.parseDouble(lineData[2]);
                double rate = Double.parseDouble(lineData[3]);

                Employee newEmployee = new Employee(id, name, hours, rate);

//                System.out.println("EMPLOYEE INFORMATION: ");
//                System.out.println("ID: " + newEmployee.getEmployeeId());
//                System.out.println("Name: " + newEmployee.getName());
//                System.out.println("Gross pay: " + newEmployee.calculateGrossPay() + "\n");

                System.out.printf("ID: %d Name: %s Pay: %.2f \n", newEmployee.getEmployeeId(), newEmployee.getName(), newEmployee.calculateGrossPay());
            }

        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

}
