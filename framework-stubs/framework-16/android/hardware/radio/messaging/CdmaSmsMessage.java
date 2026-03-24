package android.hardware.radio.messaging;

public class CdmaSmsMessage implements android.os.Parcelable {
    @java.lang.Deprecated
    public int teleserviceId;
    @java.lang.Deprecated
    public boolean isServicePresent;
    @java.lang.Deprecated
    public int serviceCategory;
    @java.lang.Deprecated
    public android.hardware.radio.messaging.CdmaSmsAddress address;
    @java.lang.Deprecated
    public android.hardware.radio.messaging.CdmaSmsSubaddress subAddress;
    @java.lang.Deprecated
    public byte[] bearerData;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsMessage> CREATOR = null;
    public CdmaSmsMessage() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
