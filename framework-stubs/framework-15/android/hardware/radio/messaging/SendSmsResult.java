package android.hardware.radio.messaging;

public class SendSmsResult implements android.os.Parcelable {
    public int messageRef;
    public java.lang.String ackPDU;
    public int errorCode;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.SendSmsResult> CREATOR = null;
    public SendSmsResult() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
