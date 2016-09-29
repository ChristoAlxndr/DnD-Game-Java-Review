package com.characters;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Warrior;
import com.parents.Twilek;

public class TwilekWarrior extends Twilek implements Warrior {

	public TwilekWarrior() {
		super();
	}

	public TwilekWarrior(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 75);

	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 0);

	}

	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.MACE);
	}
}
