package android.location;

public class Criteria implements android.os.Parcelable {
    public static final int NO_REQUIREMENT = 0;
    public static final int POWER_LOW = 1;
    public static final int POWER_MEDIUM = 2;
    public static final int POWER_HIGH = 3;
    public static final int ACCURACY_FINE = 1;
    public static final int ACCURACY_COARSE = 2;
    public static final int ACCURACY_LOW = 1;
    public static final int ACCURACY_MEDIUM = 2;
    public static final int ACCURACY_HIGH = 3;
    private int mHorizontalAccuracy;
    private int mVerticalAccuracy;
    private int mSpeedAccuracy;
    private int mBearingAccuracy;
    private int mPowerRequirement;
    private boolean mAltitudeRequired;
    private boolean mBearingRequired;
    private boolean mSpeedRequired;
    private boolean mCostAllowed;
    public static final android.os.Parcelable.Creator<android.location.Criteria> CREATOR = null;
    public Criteria() {}
    public Criteria(android.location.Criteria p0) {}
    public void setHorizontalAccuracy(int p0) {}
    public int getHorizontalAccuracy() { return 0; }
    public void setVerticalAccuracy(int p0) {}
    public int getVerticalAccuracy() { return 0; }
    public void setSpeedAccuracy(int p0) {}
    public int getSpeedAccuracy() { return 0; }
    public void setBearingAccuracy(int p0) {}
    public int getBearingAccuracy() { return 0; }
    public void setAccuracy(int p0) {}
    public int getAccuracy() { return 0; }
    public void setPowerRequirement(int p0) {}
    public int getPowerRequirement() { return 0; }
    public void setCostAllowed(boolean p0) {}
    public boolean isCostAllowed() { return false; }
    public void setAltitudeRequired(boolean p0) {}
    public boolean isAltitudeRequired() { return false; }
    public void setSpeedRequired(boolean p0) {}
    public boolean isSpeedRequired() { return false; }
    public void setBearingRequired(boolean p0) {}
    public boolean isBearingRequired() { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private static java.lang.String powerToString(int p0) { return null; }
    private static java.lang.String accuracyToString(int p0) { return null; }
    public java.lang.String toString() { return null; }
}
