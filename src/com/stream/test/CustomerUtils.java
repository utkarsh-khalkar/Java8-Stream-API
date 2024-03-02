package com.stream.test;

import java.util.Arrays;
import java.util.List;

public class CustomerUtils {
    public static List<Customer> getCustomerData()
    {
        //creating the address class object
        Address homeAddress=new Address("1-2,3","ABC Street","Nashik");
        Address officeAddress=new Address("3-2-1","XYZ Street","Pune");

        // creating the customer class object.
        Customer customer1=new Customer(1,"Kunal","Nashik","kunal@gmail.com","8934563489", Arrays.asList(homeAddress,officeAddress));
        Customer customer2=new Customer(2,"Pratik","Mumbai","pratik@gmail.com","9723045231",Arrays.asList(homeAddress,officeAddress));
        Customer customer3=new Customer(3,"Utkarsh","Pune","utkarsh@gmail.com","8379808859",Arrays.asList(homeAddress,officeAddress));
        Customer customer4=new Customer(4,"Om","Goa","om@gmail.com","3487634922",Arrays.asList(homeAddress,officeAddress));
        Customer customer5=new Customer(5,"Aditya","Pune","aditya@gmail.com","9921936953",Arrays.asList(homeAddress,officeAddress));
        Customer customer6=new Customer(6,"Ram","Sangli","ram@gmail.com","9921983412",Arrays.asList(homeAddress,officeAddress));
        Customer customer7=new Customer(7,"Sham","Pen","sham@gmail.com","9021348965",Arrays.asList(homeAddress,homeAddress));


        return Arrays.asList(customer1,customer2,customer3,customer4,customer5,customer6,customer7);




    }
}
