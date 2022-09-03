package basics;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {


        //Example1

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List 1: "+list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(list); /*adds elements from the 1st list: it will show 1,2,3,4,5,6,7,8*/
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        System.out.println("List 2: "+list2);
        System.out.println("________");

        //Example2
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("test 1");
        arrayList.add("test 2");
        arrayList.add("test 3");

        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
        System.out.println();

        for(String str: arrayList){
            System.out.print(str + " ");
        }
        //LinkedList
        LinkedList<String> car = new LinkedList<>();
        car.add("BMW");
        car.add("Tesla");
        car.add("Toyota");
        System.out.println(car);
        //last element
        System.out.println(car.get(car.size()-1));
        System.out.println(car.getLast());
        System.out.println(car.getFirst());

    }
}
