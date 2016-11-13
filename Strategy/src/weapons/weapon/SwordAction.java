package weapons.weapon;

import weapons.WeaponAction;

public class SwordAction implements WeaponAction {
    @Override
    public void useWeapon() {
        System.out.println("I use a Sword");
    }
}
