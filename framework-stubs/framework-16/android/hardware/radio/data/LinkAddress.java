package android.hardware.radio.data;

public class LinkAddress implements android.os.Parcelable {
    public java.lang.String address;
    public int addressProperties;
    public long deprecationTime;
    public long expirationTime;
    public static final android.os.Parcelable.Creator<android.hardware.radio.data.LinkAddress> CREATOR = null;
    public static final int ADDRESS_PROPERTY_NONE = 0;
    public static final int ADDRESS_PROPERTY_DEPRECATED = 32;
    public LinkAddress() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
