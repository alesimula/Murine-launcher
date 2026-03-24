package android.hardware.contexthub;

public class MessageDeliveryStatus implements android.os.Parcelable {
    public int messageSequenceNumber;
    public byte errorCode;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.MessageDeliveryStatus> CREATOR = null;
    public MessageDeliveryStatus() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
