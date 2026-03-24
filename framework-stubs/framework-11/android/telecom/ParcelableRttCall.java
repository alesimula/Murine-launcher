package android.telecom;

public class ParcelableRttCall implements android.os.Parcelable {
    private final int mRttMode = 0;
    private final android.os.ParcelFileDescriptor mTransmitStream = null;
    private final android.os.ParcelFileDescriptor mReceiveStream = null;
    public static final android.os.Parcelable.Creator<android.telecom.ParcelableRttCall> CREATOR = null;
    public ParcelableRttCall(int p0, android.os.ParcelFileDescriptor p1, android.os.ParcelFileDescriptor p2) {}
    protected ParcelableRttCall(android.os.Parcel p0) {}
    public int describeContents() { return 0; }
    public void writeToParcel(android.os.Parcel p0, int p1) {}
    public int getRttMode() { return 0; }
    public android.os.ParcelFileDescriptor getReceiveStream() { return null; }
    public android.os.ParcelFileDescriptor getTransmitStream() { return null; }
}
