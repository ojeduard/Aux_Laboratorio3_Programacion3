package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dbGUI extends JFrame{
    private JTabbedPane tabPane;
    private JPanel employeeTab;
    private JPanel departmentTab;
    private JPanel aboutTab;
    private JPanel main;
    private JTextField nameField;
    private JButton searchButton;
    private JButton deleteEmployeeButton;
    private JButton reportButton;
    private JButton addEmployeeButton;
    private JTable table1;

    private  Controller controller = new Controller();
    EmployeeView employeeView = new EmployeeView();


    public dbGUI(){
        setContentPane(this.main);
        setSize(600, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employeeView.setVisible(true);
            }
        });
    }


//    private void createTable(){
//        Object [] [] data = {
//                {},
//                {},
//                {}};
//        table1.setModel(new DefaultTableModel(
//                data,
//                new String [] {"ID", "Name", "Phone", "Salary", "Department"}
//        ));
//    }

}
