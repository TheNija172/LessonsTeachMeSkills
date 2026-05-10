package Lesson30.singleton;

public class Singleton {
    public static void main(String[] args) {
        DatabaseAccess databaseAccess = DatabaseAccess.getInstance();
        databaseAccess.setUrl("url");
        databaseAccess.setPassword("password");
        System.out.println(databaseAccess);
    }
}
