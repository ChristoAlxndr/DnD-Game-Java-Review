package com.parents;

import com.app.Weapons.Weapon;

public class Turtle extends CharacterClass {

	public Turtle() {
		super();
	}

	public Turtle(int health, int magic, String name, Weapon weapon) {
		super(health, magic, name, weapon);
	}

	@Override
	public void setHealth(int health) {
		super.setHealth(health + 25);
	}

	@Override
	public void setMagic(int magic) {
		super.setMagic(magic + 5);
	}

	@Override
	public void setName(String name) {
		super.setName("Raphael");
	}	
}
