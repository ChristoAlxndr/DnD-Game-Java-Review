package com.parents;

import com.app.Weapons.Weapon;

public class Twilek extends CharacterClass {

	public Twilek() {
		super();
	}

	public Twilek(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health + 75);
	}

	@Override
	public void setMagic(int magic) {
		super.setMagic(magic + 10);
	}

	@Override
	public void setName(String name) {
		super.setName("Oola");
	}
}
