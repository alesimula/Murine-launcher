package android.location;

public class Country implements android.os.Parcelable {
    public static final int COUNTRY_SOURCE_NETWORK = 0;
    public static final int COUNTRY_SOURCE_LOCATION = 1;
    public static final int COUNTRY_SOURCE_SIM = 2;
    public static final int COUNTRY_SOURCE_LOCALE = 3;
    private final java.lang.String mCountryIso = null;
    private final int mSource = 0;
    private int mHashCode;
    private final long mTimestamp = 0L;
    public static final android.os.Parcelable.Creator<android.location.Country> CREATOR = null;
    public Country(java.lang.String p0, int p1) {}
    private Country(java.lang.String p0, int p1, long p2) {}
    public Country(android.location.Country p0) {}
    public final java.lang.String getCountryIso() { return null; }
    public final int getSource() { return 0; }
    public final long getTimestamp() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equalsIgnoreSource(android.location.Country p0) { return false; }
    public java.lang.String toString() { return null; }
}
