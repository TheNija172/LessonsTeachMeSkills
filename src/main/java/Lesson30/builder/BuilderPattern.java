package Lesson30.builder;

public class BuilderPattern {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Vadim")
                .setAge(21)
                .setPhone("1234567")
                .build();

        System.out.println(user);
    }
}
