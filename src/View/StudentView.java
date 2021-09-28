package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class StudentView extends JFrame{
    private JTextField tfStudentName;
    private JTextField tfStudentID;
    private JList optionList;
    private JTextArea outputArea;
    private JButton searchButton;
    private JButton clearButton;
    private JPanel mainPanel;
    private JButton exitButton;

    public void setOutputAreaText(String s){
        outputArea.setText(s);
    }

    public String getStudetnName(){
        return tfStudentName.getText();
    }

    public String getStudentID(){
        return tfStudentID.getText();
    }

    public int getSelectedOption(){
        return optionList.getSelectedIndex();
    }

    public void addSearchButtonListener(ActionListener listenerForSearchButton){
        searchButton.addActionListener(listenerForSearchButton);
    }

    public StudentView(){

        String[] week = {
                "1. Search catalogue courses",
                "2. Add course to student courses",
                "3. Remove course from student courses",
                "4. View All courses in catalogue",
                "5. View all courses taken by student"};

        optionList.setListData(week);
        optionList.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        optionList.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        optionList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        setContentPane(mainPanel);
        setTitle("Student Menu");
        setSize(450,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

//        searchButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                int option = optionList.getSelectedIndex();
//                String name = tfStudentName.getText();
//                String id = tfStudentID.getText();
//                outputArea.setText(
//                        "ID: " + id
//                        + "\nName: " + name
//                        + "\noption selected: " + option
//                );
//            }
//        });
    }

    public static void main(String[] args) {
        StudentView myFrame = new StudentView();
    }


}
