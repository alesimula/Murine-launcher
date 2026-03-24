package android.telephony;

public final class AvailableNetworkInfo implements android.os.Parcelable {
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_MED = 2;
    public static final int PRIORITY_LOW = 3;
    private int mSubId;
    private int mPriority;
    private java.util.ArrayList<java.lang.String> mMccMncs;
    private java.util.ArrayList<java.lang.Integer> mBands;
    public static final android.os.Parcelable.Creator<android.telephony.AvailableNetworkInfo> CREATOR = null;
    public int getSubId() { return 0; }
    public int getPriority() { return 0; }
    public java.util.List<java.lang.String> getMccMncs() { return null; }
    public java.util.List<java.lang.Integer> getBands() { return null; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    private AvailableNetworkInfo(android.os.Parcel p0) {}
    public AvailableNetworkInfo(int p0, int p1, java.util.List<java.lang.String> p2, java.util.List<java.lang.Integer> p3) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
}
