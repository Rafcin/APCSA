package com.company.IFT;

import java.util.ArrayList;

public class Driver
{
    public static void main( String[] args )
    {
        MusicDownloads downloadDrive = new MusicDownloads();

        // populating an ArrayList to use for updateDownloads()
        ArrayList<String> nov30thDownloads = new ArrayList<String>();
        nov30thDownloads.add( "You've Got a Friend" );
        nov30thDownloads.add( "Joy to the World" );
        nov30thDownloads.add( "My Way" );
        nov30thDownloads.add( "What a Wonderful World" );
        nov30thDownloads.add( "Part of Your World" );
        nov30thDownloads.add( "Charlie Brown Christmas" );

        downloadDrive.updateDownloads( nov30thDownloads );

        System.out.println( "Downloads on November 30th:" );
        System.out.println( downloadDrive );

        // populating a second ArrayList to use for updateDownloads()
        ArrayList<String> dec1stDownloads = new ArrayList<String>();
        dec1stDownloads.add( "All I Want for Christmas Is You" );
        dec1stDownloads.add( "Charlie Brown Christmas" );
        dec1stDownloads.add( "Little Drummer Boy" );
        dec1stDownloads.add( "Joy to the World" );

        downloadDrive.updateDownloads( dec1stDownloads );

        System.out.println( "All downloads after December 1st:" );
        System.out.println( downloadDrive );
    } // end main
} // end class

