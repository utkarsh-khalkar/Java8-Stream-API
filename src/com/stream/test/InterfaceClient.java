package com.stream.test;

public class InterfaceClient {
    public static void main(String[] args) {

        // creating the message interface object pointing to the implementation class.
        Message msg=new PhoneMessage();

        // calling the interfac method.
        msg.textMessage("Hi Welcome to Stream API workshop.");
    }
}
