package com.parents;

import com.app.Weapons.Weapon;

public class Human extends CharacterClass {
	
	public Human() {
		super();
	}

	public Human(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health + 50);
	}

	@Override
	public void setMagic(int magic) {
		super.setMagic(magic + 0);
	}

	@Override
	public void setName(String name) {
		super.setName("Mark");
	}
}
