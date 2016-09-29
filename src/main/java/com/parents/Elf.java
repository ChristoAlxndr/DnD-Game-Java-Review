package com.parents;

import com.app.Weapons.Weapon;

public class Elf extends CharacterClass {

	public Elf() {
		super();
	}

	public Elf(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health + 100);
	}

	@Override
	public void setMagic(int magic) {
		super.setMagic(magic + 50);
	}

	@Override
	public void setName(String name) {
		super.setName("Legolas");
	}
}
