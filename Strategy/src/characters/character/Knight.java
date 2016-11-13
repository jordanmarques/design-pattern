package characters.character;

import characters.Character;
import weapons.weapon.SwordAction;

public class Knight extends Character {

    public Knight() {
        weaponAction = new SwordAction();
    }

    @Override
    public void fight() {
        weaponAction.useWeapon();
    }
}
