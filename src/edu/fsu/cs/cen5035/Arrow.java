package edu.fsu.cs.cen5035;

/**
 *
 * @author Yuchuan
 */
public class Arrow extends BasicWeapon implements Weapon {

    public Arrow() {
        super(70);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
		int damage;
		if (armor > 5) {
			damage = DAMAGE - armor + 5;
		}
		else {
			damage = DAMAGE;
		}
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
