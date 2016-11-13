package characters;

import weapons.WeaponAction;

public abstract class Character {
    public WeaponAction weaponAction;

    public abstract void fight();

    public void setWeaponAction(WeaponAction weaponAction) {
        this.weaponAction = weaponAction;
    }
}
