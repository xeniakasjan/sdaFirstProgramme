package advanced;

public class ExceptionExample {
    public static void main(String[] args) {

        int[] num = {1, 2, 3, 4};
        System.out.println(num[3]);
        try {

        } catch (Exception e) {
            System.out.println("Something is wrong!");
        }


        System.out.println("Hello world!");
    }
}
