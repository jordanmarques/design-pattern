package characters.character;

import characters.Character;
import weapons.weapon.BowAction;

public class Queen extends Character {

    public Queen() {
        weaponAction = new BowAction();
    }

    @Override
    public void fight() {
        weaponAction.useWeapon();
    }
}
