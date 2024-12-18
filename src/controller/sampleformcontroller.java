package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.util.ArrayList;

public class sampleformcontroller {

    public TextField txtage;
    public TextField txtaddress;
    public TextField txtname;
    public TextField txtsalary;
    public TableView tblCustomers;
    public TableColumn colName;
    public TableColumn colAge;
    public TableColumn colAddress;
    public TableColumn colSalary;

    ArrayList<Customer> customerlist=new ArrayList<>();
    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        String Name=txtname.getText();
        String Age=txtage.getText();
        String Address=txtaddress.getText();
        Double Salary=Double.parseDouble(txtsalary.getText());

        Customer c1=new Customer(Name,Age,Address,Salary);

        customerlist.add(c1);
        System.out.println(customerlist);


    }

    public void btnClickmeOnAction(ActionEvent actionEvent) {
        loadTable();

    }

    private void loadTable(){

        ObservableList<Customer> customerObservableList= FXCollections.observableArrayList();
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("Age"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("Address"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("Salary"));


        customerlist.forEach(obj->{
            customerObservableList.add(obj);
        });

        tblCustomers.setItems(customerObservableList);
    }


}
