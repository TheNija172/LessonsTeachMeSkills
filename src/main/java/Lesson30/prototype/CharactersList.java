package Lesson30.prototype;

import java.util.HashMap;
import java.util.Map;

public class CharactersList {
    private static final Map<String, Character> characters = new HashMap<>();

    static {
        characters.put("mage", new Mage("LomTik", 15, 100));
        characters.put("archer", new Archer("arbalet", 30, 50));
    }

    public static Character getCharacter(String type) {
        Character character = characters.get(type);
        if (character != null)
        {
            return character.clone();
        }
        throw new IllegalArgumentException("Нет персонажа " + type);
    }
}
