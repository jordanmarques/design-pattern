package weapons.weapon;

import weapons.WeaponAction;

public class AxeAction implements WeaponAction {
    @Override
    public void useWeapon() {
        System.out.println("I use an Axe");
    }
}
