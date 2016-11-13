package characters.character;

import characters.Character;
import weapons.weapon.DaggerAction;

public class King extends Character {

    public King() {
       weaponAction = new DaggerAction();
    }

    @Override
    public void fight() {
        weaponAction.useWeapon();
    }
}
