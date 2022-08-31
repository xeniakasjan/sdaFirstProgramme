package Basics;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class MapExample{

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        //Add values to Map
        map.put("Bob",900);
        map.put("John",920);
        System.out.println(map);

        //Get value from key
        System.out.println("John's salary: " + map.get("John"));

        //All key values
        System.out.println(map.keySet());

        //Size
        System.out.println(map.size());

        //Check if Map contains key
        System.out.println(map.containsKey("Tony")); //No Tony in the list

        //Check if Map contains value
        System.out.println(map.containsValue(900)); //We have people having salary of 900

        //Remove key/ value pair from map
        map.remove("Bob");
        System.out.println(map);
        System.out.println("__________");

        Map<String,String> capitalCity = new HashMap<>();
        capitalCity.put("Estonia", "Tallinn");
        capitalCity.put("Latvia", "Riga");
        capitalCity.put("Finland", "Helsinki");

        System.out.println(capitalCity.get("Finland"));

        for (Map.Entry<String,String> entry: capitalCity.entrySet()){

        }
    }
}
