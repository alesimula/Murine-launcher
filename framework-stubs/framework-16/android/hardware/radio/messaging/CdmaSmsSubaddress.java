package android.hardware.radio.messaging;

public class CdmaSmsSubaddress implements android.os.Parcelable {
    @java.lang.Deprecated
    public int subaddressType;
    @java.lang.Deprecated
    public boolean odd;
    @java.lang.Deprecated
    public byte[] digits;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsSubaddress> CREATOR = null;
    @java.lang.Deprecated
    public static final int SUBADDRESS_TYPE_NSAP = 0;
    @java.lang.Deprecated
    public static final int SUBADDRESS_TYPE_USER_SPECIFIED = 1;
    public CdmaSmsSubaddress() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
