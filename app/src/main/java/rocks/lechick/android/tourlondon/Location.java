package rocks.lechick.android.tourlondon;

/**
 * Created by alek on 27/04/2018.
 */

public class Location {

    //Category
    private int mCategory;

    // Name of the location
    private String mAttractionName;

    // Address of the item
    private String mAttractionAddress;

    // Working hours
    private String mAttractionHours;

    // Phone number
    private String mAttractionPhone;

    // Website address
    private String mAttractionWebsite;

    // Summary info about the loc
    private String mAttractionSummary;

    private String mAttractionAddressWebsite;

    // What's on in case of theatre
    private String mTheatreWhatsOn;

    // Drawable resource ID for images
    private int mAttractionImage1;
    private int mAttractionImage2;
    private int mAttractionImage3;

    //Is the item starred
    private boolean mStarred = false;


    // Tags by which the track might be searched, as in parts of lyrics, name of the track with typo etc


    /*
    * Create a new Attraction object.
    *
    * */
    public Location(String vAttractionName, String vAttractionAddress, String vAttractionHours,
                    String vAttractionPhone, String vAttractionWebsite, String vAttractionSummary,
                    int vAttractionImage1, int vAttractionImage2, int vAttractionImage3, boolean vStarred) {
        mAttractionName = vAttractionName;
        mAttractionAddress = vAttractionAddress;
        mAttractionHours = vAttractionHours;
        mAttractionPhone = vAttractionPhone;
        mAttractionWebsite = vAttractionWebsite;
        mAttractionSummary = vAttractionSummary;
        mAttractionImage1 = vAttractionImage1;
        mAttractionImage2 = vAttractionImage2;
        mAttractionImage3 = vAttractionImage3;
        mStarred = vStarred;
    }


    /**
     * Get the attraction name
     */
    public String getmAttractionName() {
        return mAttractionName;
    }

    /**
     * Get the address
     */
    public String getmAttractionAddress() {
        return mAttractionAddress;
    }

    /**
     * Get the working hours
     */
    public String getmAttractionHours() {
        return mAttractionHours;
    }

    /**
     * Get the phone
     */
    public String getmAttractionPhone() {
        return mAttractionPhone;
    }

    /**
     * Get the website address
     */
    public String getmAttractionWebsite() {
        return mAttractionWebsite;
    }

    /**
     * Get the summary
     */
    public String getmAttractionSummary() {
        return mAttractionSummary;
    }

    /**
     * Get the images 1, 2, 3
     */
    public int getmAttractionImage1() {
        return mAttractionImage1;
    }

    public int getmAttractionImage2() {
        return mAttractionImage2;
    }

    public int getmAttractionImage3() {
        return mAttractionImage3;
    }

    /**
     * Figure if the item's been starred or not
     */
    public boolean getmStarred() {
        return mStarred;
    }


    public Location(String vAttractionName, String vAttractionAddressWebsite, String vAttractionSummary,
                     int vAttractionImage1, boolean vStarred) {
        mAttractionName = vAttractionName;
        mAttractionAddressWebsite = vAttractionAddressWebsite;
        mAttractionSummary = vAttractionSummary;
        mAttractionImage1 = vAttractionImage1;
        mStarred = vStarred;
    }

    /**
     * Get the website address
     */
    public String getmAttractionAddressWebsite() {
        return mAttractionAddressWebsite;
    }

    public Location(String vAttractionName, String vTheatreWhatsOn, String vAttractionAddress,
                    String vAttractionAddressWebsite, String vAttractionPhone, String vAttractionSummary,
                    int vAttractionImage1, boolean vStarred) {
        mAttractionName = vAttractionName;
        mTheatreWhatsOn = vTheatreWhatsOn;
        mAttractionAddress = vAttractionAddress;
        mAttractionAddressWebsite = vAttractionAddressWebsite;
        mAttractionPhone = vAttractionPhone;
        mAttractionSummary = vAttractionSummary;
        mAttractionImage1 = vAttractionImage1;
        mStarred = vStarred;
    }

    /**
     * Get the website address
     */
    public String getmTheatreWhatsOn() {
        return mTheatreWhatsOn;
    }


}
