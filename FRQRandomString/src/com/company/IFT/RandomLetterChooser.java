package com.company.IFT;

/**
 * Created by rafaelszuminski on 2/21/18.
 */

public class RandomLetterChooser extends RandomStringChooser
{
    public RandomLetterChooser(String stringArray) {
        super(getSingle(stringArray));
    }
    // constructor to be written in part B
    public static String[] getSingle(String str )
    {
        int wordLength = str.length();
        String[] outputArray = new String[wordLength];
        for ( int i = 0; i < wordLength; i++)
        {
            outputArray[i] = str.substring(i,i+1);
        }
        return outputArray;
    }
}
