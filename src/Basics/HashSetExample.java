package Basics;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        //Add HashSet
        HashSet<String> names = new HashSet<>();

        //Add elements
        names.add("Ksenia");
        names.add("Luise");
        names.add("Marta");

        names.add("Ksenia"); //it will not print Ksenia twice

        //Print out all elements
        System.out.println(names);
    }
}
