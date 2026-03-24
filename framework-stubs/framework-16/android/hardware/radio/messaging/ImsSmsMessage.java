package android.hardware.radio.messaging;

public class ImsSmsMessage implements android.os.Parcelable {
    public int tech;
    public boolean retry;
    public int messageRef;
    @java.lang.Deprecated
    public android.hardware.radio.messaging.CdmaSmsMessage[] cdmaMessage;
    public android.hardware.radio.messaging.GsmSmsMessage[] gsmMessage;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.ImsSmsMessage> CREATOR = null;
    public ImsSmsMessage() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
