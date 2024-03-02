package com.stream.test;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<Integer> demo=n->(n%2==0);
        System.out.println(demo.test(9));

    }
}
