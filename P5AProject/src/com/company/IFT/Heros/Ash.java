package com.company.IFT.Heros;

import com.company.IFT.SuperHero;

/**
 * Created by rafaelszuminski on 2/9/18.
 */
public class Ash extends SuperHero {

    // 1 or 0 \\
    boolean isAttackerOrDenfender;
    int speed;

    public Ash(String mName, String mIdentity, boolean ab, int s, String m) {
        super(mName, mIdentity,m);
        isAttackerOrDenfender = ab;
        speed = s;
    }

    @Override
    public String getSecretIdentity() {
        return super.getSecretIdentity();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void setAttackerOrDenfender(boolean attackerOrDenfender) {
        isAttackerOrDenfender = attackerOrDenfender;
    }

    @Override
    public String toString() {
        return  "[IsAttackerOrDefender] " + isAttackerOrDenfender + "\n" +
                "[Player Speed]: " + speed + "\n"+
                "..................................................\n" +
                "....................-://++//:-....................\n" +
                "................-sdNNNNNNNNNNNNho-................\n" +
                "...............sNNNNNNNNNNNNNNNNNNo...............\n" +
                "..............oNNNNNNNNNNNNNNNNNNNN/..............\n" +
                "..............dNNNNNNNNhoodNNNNNNNNs..............\n" +
                "..............dNNNNNNNN/..oNNNNNNNNy..............\n" +
                "..............dNNNNNNNN/..ommmmmmmms..............\n" +
                "..............dNNNNNNNN/.-::::-...................\n" +
                "..............dNNNNNNNNmNNNNNNNNds:...............\n" +
                "..............dNNNNNNNNNNNNNNNNNNNN+..............\n" +
                "..............dNNNNNNNNNNNNNNNNNNNNy..............\n" +
                "..............dNNNNNNNNNNNNNNmmNNNNs..............\n" +
                "..............dNNNNNN/..+o+:...dNNNs..............\n" +
                "..............dNNNNNN-.......-:dNNNs..............\n" +
                "..............dNNNNNN-..-/+mNNNNNNNs..............\n" +
                "..............dNNNNNN-..hNyNNNNNNNNs..............\n" +
                "..............dNNNNNN-..smNNNNNNNNNs..............\n" +
                "..............dNNNNNN-..dNNNNNNNNNNs..............\n" +
                "..............dNNNNNN-..dNNNNNNNNNNs..............\n" +
                "..............sNNNNNN-..dNNNNNNNNNN/..............\n" +
                "...............hNNNNNmdmNNNNNNNNNN+...............\n" +
                "................:sdNNNNNNNNNNNmy+.................\n" +
                "....................-://++//-.....................\n" +
                "..................................................";
    }
}
