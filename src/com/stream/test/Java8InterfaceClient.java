package com.stream.test;

public class Java8InterfaceClient {
    public static void main(String[] args) {

        // Providing the implementation of functional interface abstract method.
        Message phoneMessage=(String message)-> System.out.println(message);

        // Calling the functional interface method.
        phoneMessage.textMessage("Hi Welcome to the Stream API Workshop");

        // Providing the another implementation for Functional interface method
        Message emailMessage=(message)-> System.out.println(message);

        //Calling the functional interface method
        emailMessage.textMessage("Hi Welcome to another example Functional Interface.");

    }
}
