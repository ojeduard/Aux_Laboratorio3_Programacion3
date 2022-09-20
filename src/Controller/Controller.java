package Controller;

import Model.*;
import View.*;

public class Controller {
    EmployeeManager employeeList = new EmployeeManager();
    public void startApp(){
        // Viewing and Controlling the application's GUI
        dbGUI view = new dbGUI();
        view.setVisible(true);
    }

    public void addingEmployees(String id, String name, String phone, String salary, String dptoCode){
        employeeList.add(new Employee(id, name, Integer.parseInt(phone), Double.parseDouble(salary), dptoCode));
        employeeList.createXML("Employees.xml");
    }
}
