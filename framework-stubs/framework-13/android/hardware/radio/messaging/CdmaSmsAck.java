package android.hardware.radio.messaging;

public class CdmaSmsAck implements android.os.Parcelable {
    public boolean errorClass;
    public int smsCauseCode;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsAck> CREATOR = null;
    public CdmaSmsAck() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
