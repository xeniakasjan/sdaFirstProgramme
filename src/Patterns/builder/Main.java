package Patterns.builder;

public class Main {
    public static void main(String[] args) {

    User user1 = new User.UserBuilder("Marco", "Polo")
            .age(50)
            .phone("+373 333 333")
            .address("Tallinn, EST")
            .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Antonio", "Banderas")
                .age(62)
                .phone("+77 3843472")
                //no address
                .build();

        System.out.println(user2);

 User user3 = new User.UserBuilder("Laura", "Collins").build();
        System.out.println(user3);

    }

}
