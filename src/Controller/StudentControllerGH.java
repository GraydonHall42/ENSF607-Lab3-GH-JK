package Controller;

import View.StudentView;
import Model.StudentModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentControllerGH {
    StudentView theView;
    StudentModel theModel;

    public StudentControllerGH(StudentView theView, StudentModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        theView.addSearchButtonListener(new StudentFormListener());

    }

    class StudentFormListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int option = theView.getSelectedOption();
            String name = theView.getStudetnName();
            String id = theView.getStudentID();

            switch (option) {
                case 1:
                    // theView.presentView1();
                    //theView.getClassName()
                    // theModel.searchCatalogue()...
                    // outPutString = ...
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }

            // talk to back end using this input...
            // and get a string back to output to the user

            theView.setOutputAreaText(
                    "ID: " + id
                            + "\nName: " + name
                            + "\noption selected: " + option
            );

        }
    }

}


