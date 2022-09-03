package advanced;

//enum = each enum object can have its own parameters that must be obligatory
//passed when declaring Enuma objects.

enum Level{
    EASY,
    MEDIUM,
    HARD
}

public class EnumExample {
    public static void main(String[] args) {

        Level myLevel = Level.EASY;

        switch (myLevel){
            case EASY:
                System.out.println("Easy Level");
                break;

            case MEDIUM:
                System.out.println("Medium level");
                break;

            case HARD:
                System.out.println("Hard level");
                break;
        }
    }
}
