package com.stream.test;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // get the customer inoformation from collection Object.
        List<Customer> customersData=CustomerUtils.getCustomerData();

        // converting the collection object into stream object.
        Stream<Customer> customerStream=customersData.stream();

        // wanted to display customer information by Object b Object.

        // ForEach is a Terminal Operation.
        // Consumer is a Functional Interface.
        // Passing the Consumer Object for executing the every Object.
        Consumer<Customer> customerConsumer=cus-> System.out.println(cus);
        //customerStream.forEach(customer -> System.out.println(customer));
        //customerStream.forEach(customerConsumer);


        // getting all the customer from the list of Customer.
        // map() is an Intermediate operation which is used to extract the required property.
        Stream<Customer> cStream=customersData.stream();
       // Stream<String> customerName= cStream.map(c -> c.getName());
      // customerName.forEach(cus-> System.out.println(cus));

        // Wanted to all the who are residing in Pune
        // to achive this task we need another intermediate operation which is filter().
        //filter is taking predicate functional interface parameter which can be used for condition evaluation
       cStream.filter(c->c.getLocation().equalsIgnoreCase("Pune")).forEach(x-> System.out.println(x));

    }
}
