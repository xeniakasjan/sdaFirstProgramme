package OOP.inheritance;

/*How 'Inheritance' in Object-Oriented Programming works?*/

class Parent{
    public void printParent(){
        System.out.println("This is parent class.");
    }
}

class Child extends Parent{
    public void printChild(){
        System.out.println("This is child class");
    }
}

public class subClassIntro {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.printParent();

        Child child = new Child();
        child.printParent();
        child.printChild();
    }
}
