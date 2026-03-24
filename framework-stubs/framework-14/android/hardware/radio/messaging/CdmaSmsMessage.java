package android.hardware.radio.messaging;

public class CdmaSmsMessage implements android.os.Parcelable {
    public int teleserviceId;
    public boolean isServicePresent;
    public int serviceCategory;
    public android.hardware.radio.messaging.CdmaSmsAddress address;
    public android.hardware.radio.messaging.CdmaSmsSubaddress subAddress;
    public byte[] bearerData;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsMessage> CREATOR = null;
    public CdmaSmsMessage() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
