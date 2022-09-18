package Patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.empList = list;
    }

    public void loadData() {
        //Read all employees from DataBase and put into the list
        empList.add("Frank");
        empList.add("Clara");
        empList.add("Melanie");
        empList.add("Stuart");

    }

    public List<String> getEmpList() {
        return empList;
    }

    public Object clone() {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}

