package com.company.IFT;

/**
 * Created by rafaelszuminski on 2/6/18.
 */

public abstract class SuperHero {
    private String name;
    private String secretIdentity;
    private String motto;

    public SuperHero(String mName, String mIdentity, String m)
    {
        name = mName;
        secretIdentity = mIdentity;
        motto = m;
    }

    public SuperHero(String hName)
    {
        name = hName;
        secretIdentity = "unknown";
        motto = "NA";
    }

    public String getName() {
        return name;
    }

    public String getSecretIdentity() {
        return secretIdentity;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecretIdentity(String secretIdentity) {
        this.secretIdentity = secretIdentity;
    }


    public String superInfo()
    {
        return  " ___                      _ _                \n" +
                "/ __> _ _  ___  ___  _ _ | | | ___  _ _  ___ \n" +
                "\\__ \\| | || . \\/ ._>| '_>|   |/ ._>| '_>/ . \\\n" +
                "<___/`___||  _/\\___.|_|  |_|_|\\___.|_|  \\___/\n" +
                "          |_|                                \n"+
                "\n[SuperHero Name]: "+ getName() + " [Secret Identity]: "+ getSecretIdentity() + "[Motto]: "+getMotto();
    }


}
