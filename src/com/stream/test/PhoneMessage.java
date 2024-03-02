package com.stream.test;

public class PhoneMessage implements Message{
    @Override
    public void textMessage(String string) {
        System.out.println("Phone Message:"+string);
    }
}
