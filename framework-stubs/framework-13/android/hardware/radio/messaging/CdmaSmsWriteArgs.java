package android.hardware.radio.messaging;

public class CdmaSmsWriteArgs implements android.os.Parcelable {
    public int status;
    public android.hardware.radio.messaging.CdmaSmsMessage message;
    public static final android.os.Parcelable.Creator<android.hardware.radio.messaging.CdmaSmsWriteArgs> CREATOR = null;
    public static final int STATUS_REC_UNREAD = 0;
    public static final int STATUS_REC_READ = 1;
    public static final int STATUS_STO_UNSENT = 2;
    public static final int STATUS_STO_SENT = 3;
    public CdmaSmsWriteArgs() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public java.lang.String toString() { return null; }
    public int describeContents() { return 0; }
}
