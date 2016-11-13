package weapons.weapon;

import weapons.WeaponAction;

public class DaggerAction implements WeaponAction {
    @Override
    public void useWeapon() {
        System.out.println("I use a Dagger");
    }
}
