package com.example.customiseavengers;

public class Avengers {
    String Name;
    String Weapon;
    int Picture;

    public Avengers() {
    }

    public Avengers(String name, String weapon, int picture) {
        Name = name;
        Weapon = weapon;
        Picture = picture;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        Weapon = weapon;
    }

    public int getPicture() {
        return Picture;
    }

    public void setPicture(int picture) {
        Picture = picture;
    }
}
