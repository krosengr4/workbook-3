import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        try {
            //Open FileReader and BufferedReader
            FileReader reader = new FileReader("PayrollCalculator/src/main/resources/DataFiles/employees.csv");
            BufferedReader bufferedReader = new BufferedReader(reader);
            String input;

            //Read each line
            while ((input = bufferedReader.readLine()) != null) {
                //Split each line in file at "|"
                String[] lineData = input.split("\\|");

                //Don't read the header
                if(lineData[0].equals("id")) {
                    continue;
                }

                //Create variables for each part of split file
                int id = Integer.parseInt(lineData[0]);
                String name = lineData[1];
                double hours = Double.parseDouble(lineData[2]);
                double rate = Double.parseDouble(lineData[3]);

                //Create newEmployee with each variable and print Id, name, and gross pay
                Employee newEmployee = new Employee(id, name, hours, rate);
                System.out.printf("ID: %d Name: %s Pay: %.2f \n", newEmployee.getEmployeeId(), newEmployee.getName(), newEmployee.calculateGrossPay());
            }
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
}
