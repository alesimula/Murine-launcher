package android.hardware.contexthub;

public class Message implements android.os.Parcelable {
    public int flags;
    public int sequenceNumber;
    public java.lang.String[] permissions;
    public int type;
    public byte[] content;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.Message> CREATOR = null;
    public static final int FLAG_REQUIRES_DELIVERY_STATUS = 1;
    public Message() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
