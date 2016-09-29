package com.parents;

import com.app.Weapons.Weapon;

public class Smurf extends CharacterClass {

	public Smurf() {
		super();
	}

	public Smurf(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health + 10);
	}

	@Override
	public void setMagic(int magic) {
		super.setMagic(magic + 100);
	}

	@Override
	public void setName(String name) {
		super.setName("Brainy Smurf");
	}
}
