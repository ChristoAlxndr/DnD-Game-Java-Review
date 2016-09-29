package com.characters;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Jedi;
import com.parents.Smurf;

public class SmurfJedi extends Smurf implements Jedi {

	public SmurfJedi() {
		super();
	}

	public SmurfJedi(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 50);

	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 100);

	}

	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.LIGHTSABER);
	}
	
	

}
