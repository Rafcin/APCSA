package com.company.IFT.Heros;

/**
 * Created by rafaelszuminski on 2/9/18.
 */


import com.company.IFT.SuperHero;

/**
 * Created by rafaelszuminski on 2/9/18.
 */
public class MrIncredible extends SuperHero {

    // 1 or 0 \\
    boolean isHero;
    int strength;

    public MrIncredible(String mName, String mIdentity, boolean ab, int s, String m) {
        super(mName, mIdentity,m);
        isHero = ab;
        strength = s;
    }

    @Override
    public String getSecretIdentity() {
        return super.getSecretIdentity();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setHero(boolean h) {
        isHero = h;
    }

    @Override
    public String toString() {
        return  "[IsHero?]: " + isHero + "\n" +
                "[Super Strength]: " + strength + "\n"+
                "MMMMMMMMMMMMMMMMMMMMy+:---/smMMMMMMMMMMMMMMMMMMMMM\n" +
                "MMMMMMMMMMMMMMMMMNd:-..``..--smmNMMMMMMMMMMMMMMMMM\n" +
                "MMMMMMMMMMMmdhssoo---`     .--mNmmddhdmNMMMMMMMMMM\n" +
                "MMMMMMMmhsoooooooo---`     .--mMMMMMMNmhyhmMMMMMMM\n" +
                "MMMMNhsooooooooooss--..```.--sMMMMMMMMMMMmyohmMMMM\n" +
                "MMNyooooooooyhmNMMMNy/----:omMMMMMMMMMMMMMMmsoyNMM\n" +
                "MdooooooohmMMMMMMMMMMMMNNMMMMMMMMMMMMMMMMMMMNooodM\n" +
                "mooooosdMMMMMMMMMMMMMMMMMNdhyNMMMMMMMMMMMMMMMhoood\n" +
                "sooooyNMMMMMMMMMMMMMs+/:-----mMMMMMMMMMMMMMMMhoooo\n" +
                "oooosMMMMMMMMMMMMMMM---------mMMMMMMMMMMMMMMmooooo\n" +
                "yooohMMMMMMMMMMMMMMM---------mMMMMMMMMMMMMMdoooooy\n" +
                "NsoosMMMMMMMMMMMMMMM---------mMMMMMMMMMMMdsooooosN\n" +
                "MMyoohMMMMMMMMMMMMMM---------mMMMMMMMNdyoooooooyNM\n" +
                "MMMmyosmMMMMMMMMMMMM---------dNmmdhyoooooooooymMMM\n" +
                "MMMMMNdssdNMMMMMMMMM---------+ooooooooooooshNMMMMM\n" +
                "MMMMMMMMNdhhhmNMMMMM---------+ooooooooshdNMMMMMMMM\n" +
                "MMMMMMMMMMMMMNmddddd:--------osyyhdmNMMMMMMMMMMMMM";

    }
}

