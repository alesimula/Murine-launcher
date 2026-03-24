package android.os.storage;

public final class CrateInfo implements android.os.Parcelable {
    private static final java.lang.String TAG = "CrateInfo";
    private java.lang.CharSequence mLabel;
    private long mExpiration;
    private int mUid;
    private java.lang.String mPackageName;
    private java.lang.String mId;
    public static final android.os.Parcelable.Creator<android.os.storage.CrateInfo> CREATOR = null;
    private CrateInfo() {}
    public CrateInfo(java.lang.CharSequence p0, long p1) {}
    public CrateInfo(java.lang.CharSequence p0) {}
    public java.lang.CharSequence getLabel() { return null; }
    public long getExpirationMillis() { return 0L; }
    public void setExpiration(long p0) {}
    public int hashCode() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public void readFromParcel(android.os.Parcel p0) {}
    public static android.os.storage.CrateInfo copyFrom(int p0, java.lang.String p1, java.lang.String p2) { return null; }
}
