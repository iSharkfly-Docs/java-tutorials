package com.ossez.jackson.deductionbasedpolymorphism;

public class Knight extends NamedCharacter {

    private String weapon;

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
}