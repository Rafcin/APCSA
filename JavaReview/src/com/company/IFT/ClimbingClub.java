package com.company.IFT;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rafaelszuminski on 3/7/18.
 */

public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
     *  Guaranteed not to be null. Contains only non-null references.
     */
    private List<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /** Adds a new climb with name peakName and time climbTime
     * to the list of climbs in order by name
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime)
    {
        climbList.add(new ClimbInfo(peakName,climbTime));

    }

    public String toString()
    {
        String output ="";
        for (ClimbInfo info : climbList)
        {
            output = output + info.toString() + "\n";
        }
        return output;
    }

    public static void main(String[] args)
    {
        ClimbingClub hikerClub = new ClimbingClub();
        hikerClub.addClimb("Monadnock", 274);
        hikerClub.addClimb("Whiteface", 301);
        hikerClub.addClimb("Algonquin", 225);
        hikerClub.addClimb("Monadnock", 344);
        System.out.print(hikerClub);
        System.out.println("The order printed above should be Algonquin, Monadnock, Monadnock, Whiteface");
    }

}
