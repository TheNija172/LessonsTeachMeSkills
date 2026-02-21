package Lesson15;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayDeque;
import java.util.List;

/*
 * методы удаления и добавления животных по следующим правилам:
 * добавляется всегда в начало коллекции, а удаляется всегда из конца.
 */

@Getter
@Setter
public class AnimalsNames {
    private ArrayDeque<String> names = new ArrayDeque<>();

    public AnimalsNames(String... names) {
        this.names.addAll(List.of(names));
    }

    public void addAnimalNameToStart(String name) {
        names.addFirst(name);
    }

    public void removeAnimalNameFromEnd() {
        names.removeLast();
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
