package android.hardware.contexthub;

public class ContextHubMessage implements android.os.Parcelable {
    public long nanoappId;
    public char hostEndPoint;
    public int messageType;
    public byte[] messageBody;
    public java.lang.String[] permissions;
    public static final android.os.Parcelable.Creator<android.hardware.contexthub.ContextHubMessage> CREATOR = null;
    public ContextHubMessage() {}
    public final int getStability() { return 0; }
    public final void writeToParcel(android.os.Parcel p0, int p1) {}
    public final void readFromParcel(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
}
