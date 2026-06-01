package Lesson30.singleton;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DatabaseAccess {

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static DatabaseAccess instance;

    private String url;
    private String password;

    private DatabaseAccess() {
    }

    public static DatabaseAccess getInstance() {
        if (instance == null) {
            instance = new DatabaseAccess();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "URL: " + url + "\nPassword: " + password;
    }
}
