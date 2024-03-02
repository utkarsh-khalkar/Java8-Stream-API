package com.stream.test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(

                 new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98)
        );


        //1- Find list of students whose first name starts with alphabet A
        List<Student> stratWith=list.stream().filter(dt->dt.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.println("List of Student Whose Name Starts with A"+stratWith);

        //2- Group The Student By Department Names
        Map<String,List<Student>> mapData=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println("Students grouped by the department name:"+mapData);

        //3- Find the total count of student using stream
        long totalCNT=list.stream().count();
        System.out.println("Total Count of Student:"+totalCNT);

        //4- Find the max age of student
        OptionalInt maxAge = list.stream().mapToInt(dt -> dt.getAge()).max();
        System.out.println("Max age of student : "+maxAge.getAsInt());
    }
}
