package Lesson30.prototype;

public class Prototype {
    public static void main(String[] args) {
        Character character1 = CharactersList.getCharacter("mage");
        character1.display();

        Character character2 = CharactersList.getCharacter("mage");
        character2.display();
    }
}
