import characters.Character;
import characters.character.King;
import characters.character.Knight;
import characters.character.Queen;
import characters.character.Troll;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        List<Character> characters = Arrays.asList(
                new King(),
                new Queen(),
                new Knight(),
                new Troll()
        );

        characters.forEach(character -> character.fight());
    }
}
