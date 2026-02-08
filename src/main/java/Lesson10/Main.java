package Lesson10;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        firstTask();
        secondTask();
    }

    public static void firstTask(){
        User user1 = new User("Ivan", "Ivanov", 25);
        User user2 = new User("Ivan", "Ivanov", 25);
        User user3 = new User("Vadim", "Bahai", 21, "Plush");

        System.out.println(user1.hashCode());
        System.out.println("---------");
        System.out.println(user1);
        System.out.println("---------");
        System.out.println(user2);
        System.out.println("---------");
        System.out.println(user3);
        System.out.println("---------");

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));
    }

    public static void secondTask() throws CloneNotSupportedException {
        User user1 = new User("Vadim", "Bahai", 21, "Plush");
        User user2 = user1.clone();
        User user3 = user1.deepClone();

        System.out.println("----User for clone-----");
        System.out.println(user1);
        System.out.println("----Clone user-----");
        System.out.println(user2);
        System.out.println("----Deep clone user-----");
        System.out.println(user3);

    }
}
