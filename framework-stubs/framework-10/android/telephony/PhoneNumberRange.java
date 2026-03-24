package android.telephony;

@android.annotation.SystemApi
public final class PhoneNumberRange implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.telephony.PhoneNumberRange> CREATOR = null;
    private final java.lang.String mCountryCode = null;
    private final java.lang.String mPrefix = null;
    private final java.lang.String mLowerBound = null;
    private final java.lang.String mUpperBound = null;
    public PhoneNumberRange(java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3) {}
    private PhoneNumberRange(android.os.Parcel p0) {}
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int describeContents() { return 0; }
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public java.lang.String toString() { return null; }
    private void validateLowerAndUpperBounds(java.lang.String p0, java.lang.String p1) {}
    public boolean matches(java.lang.String p0) { return false; }
}
