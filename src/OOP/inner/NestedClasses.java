package OOP.inner;

public class NestedClasses {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        System.out.println("Outerlass value: " + outerClass.num);

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println("InnerClass value: " + innerClass.num);
    }
}
