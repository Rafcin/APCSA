package com.company.IFT.Heros;

/**
 * Created by rafaelszuminski on 2/9/18.
 */

import com.company.IFT.Main;
import com.company.IFT.SuperHero;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.InputStream;

/**
 * Created by rafaelszuminski on 2/9/18.
 */
public class EdnaMode extends SuperHero {

    // 1 or 0 \\
    boolean isHero;
    boolean likescapes;

    public EdnaMode(String mName, String mIdentity, boolean ab, boolean s, String m) {
        super(mName, mIdentity,m);
        isHero = ab;
        likescapes = s;
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


    public void playSound() {
        try {
            InputStream inputStream = getClass().getResourceAsStream("suit.wav");
            AudioStream audioStream = new AudioStream(inputStream);
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
            // handle exception
        }
    }

    @Override
    public String toString() {
        return  "[IsHero?]: " + isHero + "\n" +
                "[Likes Capes?]: " + likescapes + "\n"+
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


