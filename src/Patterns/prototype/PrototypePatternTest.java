package Patterns.prototype;

import java.util.List;

public class PrototypePatternTest {
    public static void main(String[] args) {


        Employees employees1 = new Employees();
        employees1.loadData();
        System.out.println(employees1.getEmpList());

        //Use close method to get new employee object with the same value

        Employees employees2 = (Employees) employees1.clone();
        System.out.println(employees2.getEmpList());

        Employees employees3 = (Employees) employees1.clone();

        List<String> list2 = employees2.getEmpList();
        list2.add("Lola");
        System.out.println(list2);

    }
}
