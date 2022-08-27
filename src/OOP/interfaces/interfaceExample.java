package OOP.interfaces;

interface Bug{
    public void bugSound();
    public void bugSize();
}

interface Location{
    public void location();
}

class Ant implements Bug{
    public void bugSound(){
        System.out.println("tss");
    }
    public void bugSize(){
        System.out.println("small");
    }
    public void location(){
        System.out.println("Forest");
    }
}


public class interfaceExample {
    public static void main(String[] args) {
        Ant ant = new Ant();
        ant.bugSize();
        ant.bugSize();
        ant.location();
    }
}
