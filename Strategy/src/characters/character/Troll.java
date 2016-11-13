package characters.character;

import characters.Character;
import weapons.weapon.AxeAction;

public class Troll extends Character {

    public Troll() {
        weaponAction = new AxeAction();
    }

    @Override
    public void fight() {
        weaponAction.useWeapon();
    }
}
