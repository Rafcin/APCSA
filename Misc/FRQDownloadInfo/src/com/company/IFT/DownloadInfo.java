package com.company.IFT;

public class DownloadInfo
{
    private String downloadTitle;
    private int numTimesDownloaded;

    /**Creates a new instance with the given unique title and
     * sets the number of times downloaded to 1
     * @param title the unique title of the downloaded song
     */
    public DownloadInfo( String title )
    {
        downloadTitle = title;
        numTimesDownloaded = 1;
    } // end constructor

    /** @return the title */
    public String getTitle()
    {
        return downloadTitle;
    }

    /** Increment the number times downloaded by 1 */
    public void incrementTimesDownloaded()
    {
        numTimesDownloaded++;
    }

    public String toString()
    {
        return "Title: " + downloadTitle + "\n" + "Number of downloads: " + numTimesDownloaded + "\n";
    }
} // end class

