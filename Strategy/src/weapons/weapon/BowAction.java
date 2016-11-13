package weapons.weapon;

import weapons.WeaponAction;

public class BowAction implements WeaponAction {
    @Override
    public void useWeapon() {
        System.out.println("I use a Bow");
    }
}
