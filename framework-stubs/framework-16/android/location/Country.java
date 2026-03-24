package android.location;

@android.annotation.SystemApi(client=android.annotation.SystemApi.Client.PRIVILEGED_APPS)
public final class Country implements android.os.Parcelable {
    public static final int COUNTRY_SOURCE_NETWORK = 0;
    public static final int COUNTRY_SOURCE_LOCATION = 1;
    public static final int COUNTRY_SOURCE_SIM = 2;
    public static final int COUNTRY_SOURCE_LOCALE = 3;
    @android.annotation.NonNull
    public static final android.os.Parcelable.Creator<android.location.Country> CREATOR = null;
    public Country(java.lang.String p0, int p1) {}
    public Country(android.location.Country p0) {}
    @java.lang.Deprecated
    public java.lang.String getCountryIso() { return null; }
    @android.annotation.NonNull
    public java.lang.String getCountryCode() { return null; }
    public int getSource() { return 0; }
    public long getTimestamp() { return 0L; }
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public boolean equals(java.lang.Object p0) { return false; }
    public int hashCode() { return 0; }
    public boolean equalsIgnoreSource(android.location.Country p0) { return false; }
    @android.annotation.NonNull
    public java.lang.String toString() { return null; }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public static @interface CountrySource {
    }
}
