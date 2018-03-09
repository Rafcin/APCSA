package com.company.IFT;

public class Main {

    public static void main( String[] args )
    {
        MasterOrder troop123 = new MasterOrder();
        troop123.addOrder( new CookieOrder( "Thin Mints", 4 ) );
        troop123.addOrder( new CookieOrder( "Samoas", 3 ) );
        troop123.addOrder( new CookieOrder( "Trefoils", 2 ) );
        troop123.addOrder( new CookieOrder( "Thin Mints", 3 ) );
        troop123.addOrder( new CookieOrder( "Thin Mints", 5 ) );
        troop123.addOrder( new CookieOrder( "Samoas", 1 ) );
        troop123.addOrder( new CookieOrder( "Trefoils", 20 ) );

        // If you're getting something like MasterOrder@1329ab when you run your code
        // what are you missing???  You will need to code something for it to work properly.
        // On the real FRQ you might not have to do this step.

        System.out.println( "Printing all current orders" );
        System.out.println( troop123 );
        System.out.println( "Removing all Thin Mints (Should be 12)" );
        System.out.println( troop123.removeVariety( "Thin Mints" ) );
        System.out.println( "\nNow printing all current orders (Should not have Thin Mints)" );
        System.out.println( troop123 );
    }

}
