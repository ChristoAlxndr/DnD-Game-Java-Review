package com.characters;

import com.app.Weapons;
import com.app.Weapons.Weapon;
import com.interfaces.Wizzard;
import com.parents.Human;

public class HumanWizzard extends Human implements Wizzard {
	
	public HumanWizzard() {
		super();
	}

	public HumanWizzard(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void changeHealth() {
		super.setHealth(health + 0);
	}

	@Override
	public void changeMagic() {
		super.setMagic(magic + 200);
	}

	@Override
	public void setWeapon(Weapon weapon) {
		super.setWeapon(Weapon.WAND);
	}
	
	public HumanWizzard makeHumanWizard() {
		
		HumanWizzard ourHumanWizzard = new HumanWizzard();
		ourHumanWizzard.changeHealth();
		ourHumanWizzard.changeMagic();
		ourHumanWizzard.setName(null);
		ourHumanWizzard.setWeapon(null);
		
		return ourHumanWizzard;	
	}
}
